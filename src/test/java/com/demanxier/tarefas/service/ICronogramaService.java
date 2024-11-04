package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Cronograma;
import com.demanxier.tarefas.model.form.CronogramaForm;

import java.util.List;

public interface ICronogramaService {
    Cronograma create(CronogramaForm cronogramaForm);
    Cronograma get(Long id);
    List<Cronograma> getAll();
    Cronograma update(Long id, CronogramaForm cronogramaForm);
    void delete(Long id);
}
