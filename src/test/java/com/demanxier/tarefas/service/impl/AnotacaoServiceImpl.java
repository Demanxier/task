package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Anotacao;
import com.demanxier.tarefas.repository.AnotacaoRepository;
import com.demanxier.tarefas.service.IAnotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AnotacaoServiceImpl implements IAnotacaoService {

    @Autowired
    private AnotacaoRepository anotacaoRepository;

    @Override
    public Anotacao create(Anotacao anotacao) {
        anotacao.setTitulo(anotacao.getTitulo());
        anotacao.setConteudo(anotacao.getConteudo());
        anotacao.setTipoAnotacao(anotacao.getTipoAnotacao());
        anotacao.setDataCriacao(LocalDate.now());


        return anotacaoRepository.save(anotacao);
    }

    @Override
    public Anotacao get(Long id) {
        return null;
    }

    @Override
    public List<Anotacao> getAll() {
        return List.of();
    }

    @Override
    public Anotacao update(Long id, Anotacao anotacao) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
