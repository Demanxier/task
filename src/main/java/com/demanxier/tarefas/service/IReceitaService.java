package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Receita;
import com.demanxier.tarefas.model.form.ReceitaForm;

import java.util.List;

public interface IReceitaService {
    Receita create(ReceitaForm receitaForm);
    Receita get(Long id);
    List<Receita> getAll();
    Receita update(Long id, ReceitaForm receitaForm);
    void delete(Long id);
}
