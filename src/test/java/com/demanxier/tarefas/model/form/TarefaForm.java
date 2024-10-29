package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaForm {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDateTime agendamento;
    private LocalDate dataConclusao;
    private Status status;
    private Long id_usuario;
    private Long id_cards;
}
