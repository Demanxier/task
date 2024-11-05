package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Card;
import com.demanxier.tarefas.model.form.CardForm;

import java.util.List;

public interface ICardService {
    Card create(CardForm cardForm);
    Card get(Long id);
    List<Card> getAll();
    Card update(Long id, CardForm cardForm);
    void delete(Long id);
}
