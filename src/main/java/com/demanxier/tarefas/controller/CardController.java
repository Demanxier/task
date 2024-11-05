package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Card;
import com.demanxier.tarefas.model.form.CardForm;
import com.demanxier.tarefas.service.impl.CardServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
@CrossOrigin(origins = "http://localhost:3000")
public class CardController {

    @Autowired
    private CardServiceImpl cardService;

    @PostMapping
    public Card create(@Valid @RequestBody CardForm cardForm){
        return cardService.create(cardForm);
    }

    @GetMapping
    public List<Card> getALL(){
        return cardService.getAll();
    }

    @GetMapping("/{id}")
    public Card get(@PathVariable Long id){
        return cardService.get(id);
    }

    @PutMapping("/{id}")
    public Card update(@PathVariable Long id, @Valid @RequestBody CardForm cardForm){
        return cardService.update(id, cardForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        cardService.delete(id);
    }
}
