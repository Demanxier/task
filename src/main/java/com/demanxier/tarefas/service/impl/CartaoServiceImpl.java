package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Cartao;
import com.demanxier.tarefas.model.form.CartaoForm;
import com.demanxier.tarefas.repository.CartaoRepository;
import com.demanxier.tarefas.service.ICartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoServiceImpl implements ICartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Override
    public Cartao create(CartaoForm cartaoForm) {
        Cartao cartao = new Cartao();

        cartao.setNome(cartaoForm.getNome());
        cartao.setLimite(cartaoForm.getLimite());
        cartao.setTipoCartao(cartaoForm.getTipoCartao());
        cartao.setSaldoUsado(cartaoForm.getSaldoUsado());
        return cartaoRepository.save(cartao);
    }

    @Override
    public Cartao get(Long id) {
        return cartaoRepository.findById(id).get();
    }

    @Override
    public List<Cartao> getAll() {
        return cartaoRepository.findAll();
    }

    @Override
    public Cartao update(Long id, CartaoForm cartaoForm) {
        Cartao cartao = cartaoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cartão não encontrado."));

        cartao.setNome(cartaoForm.getNome());
        cartao.setLimite(cartaoForm.getLimite());
        cartao.setTipoCartao(cartaoForm.getTipoCartao());
        cartao.setSaldoUsado(cartaoForm.getSaldoUsado());
        return cartaoRepository.save(cartao);
    }

    @Override
    public void delete(Long id) {
        Cartao cartao = cartaoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cartão não encontrado."));

        cartaoRepository.delete(cartao);
    }
}
