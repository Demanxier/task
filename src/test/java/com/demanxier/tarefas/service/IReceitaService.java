package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Receita;

import java.util.List;

public interface IReceitaService {
    Receita create(Receita receita);
    Receita get(Long id);
    List<Receita> getAll();
    Receita update(Long id, Receita receita);
    void delete(Long id);
}
