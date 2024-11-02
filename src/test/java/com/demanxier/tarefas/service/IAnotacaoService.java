package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Anotacao;

import java.util.List;

public interface IAnotacaoService {
    Anotacao create(Anotacao anotacao);
    Anotacao get(Long id);
    List<Anotacao> getAll();
    Anotacao update(Long id, Anotacao anotacao);
    void delete(Long id);
}
