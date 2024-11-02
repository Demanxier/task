package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Cartao;

import java.util.List;

public interface ICartaoService {
    Cartao create(Cartao cartao);
    Cartao get(Long id);
    List<Cartao> getAll();
    Cartao update(Long id, Cartao cartao);
    void delete(Long id);
}
