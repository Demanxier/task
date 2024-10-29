package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Financa;
import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.Receita;
import com.demanxier.tarefas.service.impl.FinancaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/financas")
public class FinancaController {
    @Autowired
    private FinancaServiceImpl financaService;

    @PutMapping("/{id}/atualizarTotais")
    public Financa atualizarTotais(@PathVariable Long id){
        return financaService.atualizarTotais(id);
    }

    @PostMapping("/{id}/receitas")
    public Receita adicionarReceita(@PathVariable Long id, @RequestBody Receita receita) {
        return financaService.adicionarReceita(id, receita);
    }

    @PostMapping("/{id}/gastos")
    public Gasto adicionarGasto(@PathVariable Long id, @RequestBody Gasto gasto) {
        return financaService.adicionaGasto(id, gasto);
    }
}
