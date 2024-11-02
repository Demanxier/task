package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Tarefa;
import com.demanxier.tarefas.model.form.TarefaForm;
import com.demanxier.tarefas.model.form.TarefaUpdateForm;

import java.util.List;

public interface ITarefaService {
    Tarefa create(TarefaForm tarefaForm);
    Tarefa get(Long id);
    List<Tarefa> getAll();
    Tarefa update(Long id, TarefaForm tarefaForm);
    void delete(Long id);

    //Trocas de status e prioridades
    Tarefa statusAgendado(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa statusAFazer(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa statusFazendo(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa statusPausado(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa statusPendente(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa statusConcluido(Long id, TarefaUpdateForm tarefaUpdateForm);

    Tarefa prioridadeUrgente(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa prioridadeAlta(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa prioridadeBaixa(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa prioridadeSemPrioridade(Long id, TarefaUpdateForm tarefaUpdateForm);

    Tarefa updateDescricao(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa updateDatas(Long id, TarefaUpdateForm tarefaUpdateForm);
    Tarefa updateCusto(Long id, TarefaUpdateForm tarefaUpdateForm);
}
