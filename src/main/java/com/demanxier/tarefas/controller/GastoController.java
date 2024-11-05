package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.form.GastoForm;
import com.demanxier.tarefas.service.impl.GastoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gasto")
@CrossOrigin(origins = "http://localhost:3000")
public class GastoController {

    @Autowired
    private GastoServiceImpl gastoService;

    @PostMapping
    public Gasto create(@Valid @RequestBody GastoForm gastoForm){
        return gastoService.create(gastoForm);
    }

    @GetMapping
    public List<Gasto> getAll(){
        return gastoService.getAll();
    }

    @GetMapping("/{id}")
    public Gasto get(@PathVariable Long id){
        return gastoService.get(id);
    }

    @PutMapping("/{id}")
    public Gasto update(@PathVariable Long id, @Valid @RequestBody GastoForm gastoForm){
        return gastoService.update(id, gastoForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        gastoService.delete(id);
    }
}
