package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Tarefa;
import com.demanxier.tarefas.service.ITarefaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements ITarefaService {


    @Override
    public Tarefa criarTarefa(Tarefa tarefa) {
        return null;
    }

    @Override
    public List<Tarefa> listarTarefas() {
        return List.of();
    }

    @Override
    public Tarefa atualizarTarefa(Long id, Tarefa tarefa) {
        return null;
    }

    @Override
    public void excluirTarefa(Long id) {

    }
}
