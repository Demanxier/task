package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Cronograma;
import com.demanxier.tarefas.model.form.CronogramaForm;
import com.demanxier.tarefas.service.impl.CronogramaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cronograma")
public class CronogramaController {

    @Autowired
    private CronogramaServiceImpl cronogramaService;

    @PostMapping
    public Cronograma create(@Valid @RequestBody CronogramaForm cronogramaForm){
        return cronogramaService.create(cronogramaForm);
    }

    @GetMapping
    public List<Cronograma> getAll(){
        return cronogramaService.getAll();
    }

    @GetMapping("/{id}")
    public Cronograma get(@PathVariable Long id){
        return cronogramaService.get(id);
    }

    @PutMapping("/{id}")
    public Cronograma update(@PathVariable Long id, @Valid @RequestBody CronogramaForm form){
        return cronogramaService.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        cronogramaService.delete(id);
    }
}
