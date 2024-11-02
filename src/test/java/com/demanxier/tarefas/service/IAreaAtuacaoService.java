package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.AreaAtuacao;

import java.util.List;

public interface IAreaAtuacaoService {
    AreaAtuacao create(AreaAtuacao areaAtuacao);
    AreaAtuacao get(Long id);
    List<AreaAtuacao> getAll();
    AreaAtuacao update(Long id, AreaAtuacao areaAtuacao);
    void delete(Long id);
}
