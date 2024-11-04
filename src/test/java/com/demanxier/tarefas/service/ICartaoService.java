package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Cartao;
import com.demanxier.tarefas.model.form.CartaoForm;

import java.util.List;

public interface ICartaoService {
    Cartao create(CartaoForm cartaoForm);
    Cartao get(Long id);
    List<Cartao> getAll();
    Cartao update(Long id, CartaoForm cartaoForm);
    void delete(Long id);
}
