package com.demanxier.tarefas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String conteudo;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    @ManyToOne
    @JoinColumn(name = "id_tarefa")
    @JsonBackReference
    private Tarefa tarefa;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Arquivo> arquivos;
}
