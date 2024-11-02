package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.Prioridade;
import com.demanxier.tarefas.model.enuns.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaUpdateForm {

    private String descricao;
    private Status status;
    private Prioridade prioridade;
    private LocalDate dataVencimento;
    private LocalDateTime agendamento;
    private Double custo;
}
