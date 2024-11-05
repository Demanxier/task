package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.AreaAtuacao;
import com.demanxier.tarefas.model.form.AreaAtuacaoForm;
import com.demanxier.tarefas.service.impl.AreaAtuacaoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areaAtuacao")
@CrossOrigin(origins = "https://localhost:3000")
public class AreaAtuacaoController {

    @Autowired
    private AreaAtuacaoServiceImpl areaAtuacaoService;

    @PostMapping
    public AreaAtuacao create(@Valid @RequestBody AreaAtuacaoForm areaAtuacaoForm){
        return areaAtuacaoService.create(areaAtuacaoForm);
    }

    @GetMapping
    public List<AreaAtuacao> getAll(){
        return areaAtuacaoService.getAll();
    }

    @GetMapping("/{id}")
    public AreaAtuacao get(@PathVariable Long id){
        return areaAtuacaoService.get(id);
    }

    @PutMapping("/{id}")
    public AreaAtuacao update(@PathVariable Long id, @Valid @RequestBody AreaAtuacaoForm areaAtuacaoForm){
        return areaAtuacaoService.update(id, areaAtuacaoForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        areaAtuacaoService.delete(id);
    }
}
