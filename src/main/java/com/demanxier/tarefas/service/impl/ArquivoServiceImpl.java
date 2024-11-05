package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Arquivo;
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
    public Arquivo create(ArquivoForm arquivoForm) {
        Arquivo arquivo = new Arquivo();

        arquivo.setNome(arquivoForm.getNome());
        arquivo.setConteudo(arquivoForm.getConteudo());
        arquivo.setCard(arquivoForm.getCard());
        arquivo.setTipo(arquivoForm.getTipo());
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
    public Arquivo update(Long id, ArquivoForm arquivoForm) {
        Arquivo arquivo = arquivoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Arquivo não encontrado."));

        arquivo.setNome(arquivoForm.getNome());
        arquivo.setConteudo(arquivoForm.getConteudo());
        arquivo.setCard(arquivoForm.getCard());
        arquivo.setTipo(arquivoForm.getTipo());

        return arquivoRepository.save(arquivo);
    }

    @Override
    public void delete(Long id) {
        Arquivo arquivo = arquivoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Arquivo não encontrado."));
        arquivoRepository.delete(arquivo);
    }
}
