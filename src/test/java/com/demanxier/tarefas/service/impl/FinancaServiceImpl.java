package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Financa;
import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.Receita;
import com.demanxier.tarefas.repository.FinancaRepository;
import com.demanxier.tarefas.service.IFinancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancaServiceImpl implements IFinancaService {

    @Autowired
    private FinancaRepository financaRepository;

    @Override
    public Financa atualizarTotais(Long financaId) {
        Financa financa = financaRepository.findById(financaId)
                .orElseThrow(()-> new RuntimeException("Não encontrado!"));

        financa.atualizarTotais();
        return financaRepository.save(financa);
    }

    @Override
    public Receita adicionarReceita(Long financaId, Receita receita) {
        Financa financa = financaRepository.findById(financaId)
                .orElseThrow(()-> new RuntimeException("Não encontrado!"));

        receita.setFinanca(financa);
        financa.getReceitas().add(receita);
        financa.atualizarTotais();
        financaRepository.save(financa);
        return receita;
    }

    @Override
    public Gasto adicionaGasto(Long financaId, Gasto gasto) {
        Financa financa = financaRepository.findById(financaId)
                .orElseThrow(()-> new RuntimeException("Não encontrado!"));

        gasto.setFinanca(financa);
        financa.getGastos().add(gasto);
        financa.atualizarTotais();
        financaRepository.save(financa);
        return gasto;
    }
}
