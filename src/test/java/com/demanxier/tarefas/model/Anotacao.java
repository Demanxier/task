package com.demanxier.tarefas.model;

import com.demanxier.tarefas.model.enuns.TipoAnotacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_anotacao")
public class Anotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String conteudo;
    private LocalDate dataCriacao;

    @Enumerated(EnumType.STRING)
    private TipoAnotacao tipoAnotacao;
}
