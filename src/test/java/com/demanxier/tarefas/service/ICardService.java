package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Card;

import java.util.List;

public interface ICardService {
    Card create(Card card);
    Card get(Long id);
    List<Card> getAll();
    Card update(Long id, Card card);
    void delete(Long id);
}
