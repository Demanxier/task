package com.demanxier.tarefas.model;

import com.demanxier.tarefas.model.enuns.Categoria;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cronograma")
public class Cronograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataAcao;
    private LocalTime horIni;
    private LocalTime horFim;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tarefa")
    @JsonIgnoreProperties({"cronograma"})
    private Tarefa tarefa;
}
