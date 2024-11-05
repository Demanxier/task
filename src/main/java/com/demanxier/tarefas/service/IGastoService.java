package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.form.GastoForm;

import java.util.List;

public interface IGastoService {
    Gasto create(GastoForm gastoForm);
    Gasto get(Long id);
    List<Gasto> getAll();
    Gasto update(Long id, GastoForm gastoForm);
    void delete(Long id);
}
