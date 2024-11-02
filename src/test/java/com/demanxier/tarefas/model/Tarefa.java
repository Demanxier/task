package com.demanxier.tarefas.model;

import com.demanxier.tarefas.model.enuns.Prioridade;
import com.demanxier.tarefas.model.enuns.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data //Getter, Setter, equals(), hashCode() e toString()
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construtor que recebe todos os atrubutos
@Entity //Defini que a classe é uma entidade
@Table(name = "tb_tarefa") // Define o nome da tabela no Banco de Dados
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDateTime agendamento;
    private LocalDate dataConclusao;
    private LocalDate dataVencimento;
    private Double custo;
    private boolean recorrencia;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @ManyToOne
    private AreaAtuacao areaAtuacao;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "tarefa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Card> cards;

    //CascadeType.All: Significa que se eu alterar a tarefa,vai se recletir a todos os cronogramas relacionados.
    @OneToMany(mappedBy = "tarefa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties({"tarefa"})
    private List<Cronograma> cronogramas = new ArrayList<>();
}
