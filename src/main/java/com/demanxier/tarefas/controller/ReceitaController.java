package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Receita;
import com.demanxier.tarefas.model.form.ReceitaForm;
import com.demanxier.tarefas.service.impl.ReceitaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receita")
@CrossOrigin(origins = "http://localhost:3000")
public class ReceitaController {

    @Autowired
    private ReceitaServiceImpl receitaService;

    @PostMapping
    public Receita create(@Valid @RequestBody ReceitaForm receitaForm){
        return receitaService.create(receitaForm);
    }

    @GetMapping
    public List<Receita> getAll(){
        return receitaService.getAll();
    }

    @GetMapping("/{id}")
    public Receita get(@PathVariable Long id){
        return receitaService.get(id);
    }

    @PutMapping("/{id}")
    public Receita update(@PathVariable Long id, @Valid @RequestBody ReceitaForm receitaForm){
        return receitaService.update(id, receitaForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        receitaService.delete(id);
    }
}
