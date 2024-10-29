package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Card;
import com.demanxier.tarefas.model.Usuario;
import com.demanxier.tarefas.model.enuns.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
    private Usuario usuario;
    private List<Card> cards;
}
