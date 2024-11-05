package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Arquivo;
import com.demanxier.tarefas.model.form.ArquivoForm;

import java.util.List;

public interface IArquivoService {
    Arquivo create(ArquivoForm arquivoForm);
    Arquivo get(Long id);
    List<Arquivo> getAll();
    Arquivo update(Long id, ArquivoForm arquivoForm);
    void delete(Long id);
}
