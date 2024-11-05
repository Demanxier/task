package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Cartao;
import com.demanxier.tarefas.model.form.CartaoForm;
import com.demanxier.tarefas.service.impl.CartaoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
@CrossOrigin(origins = "http://localhost:3000")
public class CartaoController {

    @Autowired
    private CartaoServiceImpl cartaoService;

    @PostMapping
    public Cartao create(@Valid @RequestBody CartaoForm cartaoForm){
        return cartaoService.create(cartaoForm);
    }

    @GetMapping
    public List<Cartao> getAll(){
        return cartaoService.getAll();
    }

    @GetMapping("/{id}")
    public Cartao get(@PathVariable Long id){
        return cartaoService.get(id);
    }

    @PutMapping("/{id}")
    public Cartao update(@PathVariable Long id, @Valid @RequestBody CartaoForm cartaoForm){
        return cartaoService.update(id, cartaoForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        cartaoService.delete(id);
    }
}
