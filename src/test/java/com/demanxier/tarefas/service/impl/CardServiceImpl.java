package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Arquivo;
import com.demanxier.tarefas.model.Card;
import com.demanxier.tarefas.model.form.CardForm;
import com.demanxier.tarefas.repository.ArquivoRepository;
import com.demanxier.tarefas.repository.CardRepository;
import com.demanxier.tarefas.repository.TarefaRepository;
import com.demanxier.tarefas.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CardServiceImpl implements ICardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private TarefaRepository tarefaRepository;

    @Autowired
    private ArquivoRepository arquivoRepository;

    @Override
    public Card create(CardForm cardForm) {
        Card card = new Card();

        card.setConteudo(cardForm.getConteudo());
        card.setCriadoEm(LocalDateTime.now());
        card.setTarefa(cardForm.getTarefa());
        card.setArquivos(cardForm.getArquivos());
        return cardRepository.save(card);
    }

    @Override
    public Card get(Long id) {
        return cardRepository.findById(id).get();
    }

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    @Override
    public Card update(Long id, CardForm cardForm) {
        Card card = cardRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Card não encontrado."));

        Arquivo arquivo = arquivoRepository.findById(cardForm.getId_arquivo())
                        .orElseThrow(()-> new RuntimeException("Arquivo não encontrado."));

        card.setConteudo(cardForm.getConteudo());
        card.setAtualizadoEm(LocalDateTime.now());

        card.setArquivos((List<Arquivo>) arquivo);

        return cardRepository.save(card);
    }

    @Override
    public void delete(Long id) {
        Card card = cardRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Card não encontrado."));
        cardRepository.delete(card);
    }
}
