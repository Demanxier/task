package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Tarefa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AreaAtuacaoForm {
    private String nome;
    private List<Tarefa> tarefas;
}
