package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Tarefa;

import java.util.List;

public interface ITarefaService {
    Tarefa criarTarefa(Tarefa tarefa);
    List<Tarefa> listarTarefas();
    Tarefa atualizarTarefa(Long id, Tarefa tarefa);
    void excluirTarefa(Long id);
}
