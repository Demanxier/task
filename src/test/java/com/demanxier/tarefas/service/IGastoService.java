package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Gasto;

import java.util.List;

public interface IGastoService {
    Gasto create(Gasto gasto);
    Gasto get(Long id);
    List<Gasto> getAll();
    Gasto update(Long id, Gasto gasto);
    void delete(Long id);
}
