package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Arquivo;
import com.demanxier.tarefas.model.form.ArquivoForm;
import com.demanxier.tarefas.service.impl.ArquivoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arquivo")
@CrossOrigin(origins = "http://localhost:3000")
public class ArquivoController {

    @Autowired
    private ArquivoServiceImpl arquivoService;

    @PostMapping
    public Arquivo create(@Valid @RequestBody ArquivoForm arquivoForm){
        return arquivoService.create(arquivoForm);
    }

    @GetMapping
    public List<Arquivo> getAll(){
        return arquivoService.getAll();
    }

    @GetMapping("/{id}")
    public Arquivo get(@PathVariable Long id){
        return arquivoService.get(id);
    }

    @PutMapping("/{id}")
    public Arquivo update(@PathVariable Long id, @Valid @RequestBody ArquivoForm arquivoForm){
        return arquivoService.update(id, arquivoForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        arquivoService.delete(id);
    }
}
