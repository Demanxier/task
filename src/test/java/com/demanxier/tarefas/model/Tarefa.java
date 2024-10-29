package com.demanxier.tarefas.model;

import com.demanxier.tarefas.model.enuns.Prioridade;
import com.demanxier.tarefas.model.enuns.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_tarefa")
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

    @OneToMany(mappedBy = "tarefa", cascade = CascadeType.ALL)
    private List<Card> cards;
}
