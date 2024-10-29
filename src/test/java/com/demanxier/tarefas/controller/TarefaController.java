package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Tarefa;
import com.demanxier.tarefas.model.form.TarefaForm;
import com.demanxier.tarefas.service.impl.TarefaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaServiceImpl tarefaService;

    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.criarTarefa(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTarefa(){
        return tarefaService.listarTarefas();
    }

    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa){
        return tarefaService.atualizarTarefa(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void excluirTarefa(@PathVariable Long id){
        tarefaService.excluirTarefa(id);
    }
}
