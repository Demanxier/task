package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Arquivo;

import java.util.List;

public interface IArquivoService {
    Arquivo create(Arquivo arquivo);
    Arquivo get(Long id);
    List<Arquivo> getAll();
    Arquivo update(Long id, Arquivo arquivo);
    void delete(Long id);
}
