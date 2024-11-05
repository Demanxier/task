package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.AreaAtuacao;
import com.demanxier.tarefas.model.form.AreaAtuacaoForm;
import com.demanxier.tarefas.repository.AreaAtuacaoRepository;
import com.demanxier.tarefas.service.IAreaAtuacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaAtuacaoServiceImpl implements IAreaAtuacaoService {

    @Autowired
    private AreaAtuacaoRepository areaAtuacaoRepository;

    @Override
    public AreaAtuacao create(AreaAtuacaoForm areaAtuacaoForm) {
        AreaAtuacao areaAtuacao = new AreaAtuacao();

        areaAtuacao.setNome(areaAtuacaoForm.getNome());
        areaAtuacao.setTarefas(areaAtuacaoForm.getTarefas());

        return areaAtuacaoRepository.save(areaAtuacao);
    }

    @Override
    public AreaAtuacao get(Long id) {
        return areaAtuacaoRepository.findById(id).get();
    }

    @Override
    public List<AreaAtuacao> getAll() {
        return areaAtuacaoRepository.findAll();
    }

    @Override
    public AreaAtuacao update(Long id, AreaAtuacaoForm areaAtuacaoForm) {
        AreaAtuacao areaAtuacao = areaAtuacaoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Area não encontrada."));

        areaAtuacao.setNome(areaAtuacaoForm.getNome());
        areaAtuacao.setTarefas(areaAtuacaoForm.getTarefas());
        return areaAtuacaoRepository.save(areaAtuacao);
    }

    @Override
    public void delete(Long id) {
        AreaAtuacao areaAtuacao = areaAtuacaoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Nenhuma área não encontrada."));
        areaAtuacaoRepository.delete(areaAtuacao);
    }
}
