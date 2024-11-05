package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Anotacao;
import com.demanxier.tarefas.model.form.AnotacaoForm;
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
    public Anotacao create(AnotacaoForm anotacaoForm) {
        Anotacao anotacao = new Anotacao();
        anotacao.setTitulo(anotacaoForm.getTitulo());
        anotacao.setConteudo(anotacaoForm.getConteudo());
        anotacao.setTipoAnotacao(anotacaoForm.getTipoAnotacao());
        anotacao.setDataCriacao(LocalDate.now());
        return anotacaoRepository.save(anotacao);
    }

    @Override
    public Anotacao get(Long id) {
        return anotacaoRepository.findById(id).get();
    }

    @Override
    public List<Anotacao> getAll() {
        return anotacaoRepository.findAll();
    }

    @Override
    public Anotacao update(Long id, AnotacaoForm anotacaoForm) {
        Anotacao anotacao = anotacaoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Anotação não encontrada."));

        anotacao.setTitulo(anotacaoForm.getTitulo());
        anotacao.setConteudo(anotacaoForm.getConteudo());
        anotacao.setTipoAnotacao(anotacaoForm.getTipoAnotacao());
        anotacao.setDataAtualizacao(LocalDate.now());
        return anotacaoRepository.save(anotacao);
    }

    @Override
    public void delete(Long id) {
        Anotacao anotacao = anotacaoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Anotação não encontrada."));
        anotacaoRepository.delete(anotacao);
    }
}
