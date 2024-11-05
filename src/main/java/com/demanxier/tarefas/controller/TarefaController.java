package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Tarefa;
import com.demanxier.tarefas.model.form.TarefaForm;
import com.demanxier.tarefas.service.impl.TarefaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin(origins = "http://localhost:3000")
public class TarefaController {

    @Autowired
    private TarefaServiceImpl tarefaService;

    @PostMapping
    public Tarefa create(@Valid @RequestBody TarefaForm tarefaForm){
        return tarefaService.create(tarefaForm);
    }

    @GetMapping
    public List<Tarefa> getAll(){
        return tarefaService.getAll();
    }

    @GetMapping("/{id}")
    public Tarefa get(@PathVariable Long id){
        return tarefaService.get(id);
    }

    @PutMapping("/{id}")
    public Tarefa update(@PathVariable Long id, @Valid @RequestBody TarefaForm tarefaForm){
        return tarefaService.update(id, tarefaForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        tarefaService.delete(id);
    }
}
