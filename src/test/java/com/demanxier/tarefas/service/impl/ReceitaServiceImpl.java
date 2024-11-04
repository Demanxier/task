package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Receita;
import com.demanxier.tarefas.model.form.ReceitaForm;
import com.demanxier.tarefas.repository.ReceitaRepository;
import com.demanxier.tarefas.service.IReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaServiceImpl implements IReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    @Override
    public Receita create(ReceitaForm receitaForm) {
        Receita receita = new Receita();
        receita.setDescricao(receitaForm.getDescricao());
        receita.setValor(receitaForm.getValor());
        receita.setDataRecebimento(receitaForm.getDataRecebimento());
        return receitaRepository.save(receita);
    }

    @Override
    public Receita get(Long id) {
        return receitaRepository.findById(id).get();
    }

    @Override
    public List<Receita> getAll() {
        return receitaRepository.findAll();
    }

    @Override
    public Receita update(Long id, ReceitaForm receitaForm) {
        Receita receita = receitaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Receita não encontrada."));
        receita.setDescricao(receitaForm.getDescricao());
        receita.setValor(receitaForm.getValor());
        receita.setDataRecebimento(receitaForm.getDataRecebimento());
        return receitaRepository.save(receita);
    }

    @Override
    public void delete(Long id) {
        Receita receita = receitaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Receita não enontrada."));
        receitaRepository.delete(receita);
    }
}
