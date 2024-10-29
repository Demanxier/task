package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Financa;
import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.Receita;

public interface IFinancaService {
    Financa atualizarTotais(Long financaId);
    Receita adicionarReceita(Long financaId, Receita receita);
    Gasto adicionaGasto(Long financaId, Gasto gasto);
}
