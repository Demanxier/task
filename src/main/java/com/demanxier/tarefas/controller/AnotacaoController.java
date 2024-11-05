package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Anotacao;
import com.demanxier.tarefas.model.form.AnotacaoForm;
import com.demanxier.tarefas.service.impl.AnotacaoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anotacao")
@CrossOrigin(origins = "http://localhost:3000")
public class AnotacaoController {

    @Autowired
    private AnotacaoServiceImpl anotacaoService;

    @PostMapping
    public Anotacao create(@Valid @RequestBody AnotacaoForm anotacaoForm){
        return  anotacaoService.create(anotacaoForm);
    }

    @GetMapping
    public List<Anotacao> getAll(){
        return anotacaoService.getAll();
    }

    @GetMapping("/{id}")
    public Anotacao get(@PathVariable Long id){
        return anotacaoService.get(id);
    }

    @PutMapping("/{id}")
    public Anotacao update(@PathVariable Long id, @Valid @RequestBody AnotacaoForm anotacaoForm){
        return anotacaoService.update(id, anotacaoForm);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        anotacaoService.delete(id);
    }

}
