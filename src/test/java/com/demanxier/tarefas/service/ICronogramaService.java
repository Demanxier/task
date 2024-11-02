package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Cronograma;

import java.util.List;

public interface ICronogramaService {
    Cronograma create(Cronograma cronograma);
    Cronograma get(Long id);
    List<Cronograma> getAll();
    Cronograma update(Long id, Cronograma cronograma);
    void delete(Long id);
}
