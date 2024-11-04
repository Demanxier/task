package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Anotacao;
import com.demanxier.tarefas.model.form.AnotacaoForm;

import java.util.List;

public interface IAnotacaoService {
    Anotacao create(AnotacaoForm anotacaoForm);
    Anotacao get(Long id);
    List<Anotacao> getAll();
    Anotacao update(Long id, AnotacaoForm anotacaoForm);
    void delete(Long id);
}
