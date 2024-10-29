package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Arquivo;
import com.demanxier.tarefas.model.Card;
import com.demanxier.tarefas.model.form.ArquivoForm;
import com.demanxier.tarefas.repository.ArquivoRepository;
import com.demanxier.tarefas.repository.CardRepository;
import com.demanxier.tarefas.service.IArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArquivoServiceImpl implements IArquivoService {
    @Autowired
    private ArquivoRepository arquivoRepository;

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Arquivo create(ArquivoForm form){
        Card card = cardRepository.findById(form.getId_card())
                .orElseThrow(()-> new RuntimeException("Card não encontrado!"));

        Arquivo arquivo = new Arquivo();
        arquivo.setNome(form.getNome());
        arquivo.setTipo(form.getTipo());
        arquivo.setConteudo(form.getConteudo());

        arquivo.setCard(card);

        return arquivoRepository.save(arquivo);
    }

    @Override
    public Arquivo get(Long id) {
        return arquivoRepository.findById(id).get();
    }

    @Override
    public List<Arquivo> getAll() {
        return arquivoRepository.findAll();
    }

    @Override
    public Arquivo update(Long id, ArquivoForm updateForm) {
        Arquivo arquivo = arquivoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Arquivo não encontrado."));

        arquivo.setNome(updateForm.getNome());
        arquivo.setTipo(updateForm.getTipo());
        arquivo.setConteudo(updateForm.getConteudo());

        return arquivoRepository.save(arquivo);
    }

    @Override
    public void delete(Long id) {
        Arquivo arquivo = arquivoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Arquivo não encontrado."));

        arquivoRepository.delete(arquivo);
    }
}
