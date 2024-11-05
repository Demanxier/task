package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.AreaAtuacao;
import com.demanxier.tarefas.model.form.AreaAtuacaoForm;

import java.util.List;

public interface IAreaAtuacaoService {
    AreaAtuacao create(AreaAtuacaoForm areaAtuacaoForm);
    AreaAtuacao get(Long id);
    List<AreaAtuacao> getAll();
    AreaAtuacao update(Long id, AreaAtuacaoForm areaAtuacaoForm);
    void delete(Long id);
}
