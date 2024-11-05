package com.demanxier.tarefas.controller;

import com.demanxier.tarefas.model.Usuario;
import com.demanxier.tarefas.model.form.UsuarioForm;
import com.demanxier.tarefas.model.form.UsuarioLoginForm;
import com.demanxier.tarefas.response.UsuarioResponse;
import com.demanxier.tarefas.service.impl.UsuarioServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping
    public Usuario create(@Valid @RequestBody UsuarioForm usuarioForm){
        return usuarioService.create(usuarioForm);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioLoginForm loginForm){
        try{
            Usuario usuario = usuarioService.login(loginForm);
            UsuarioResponse response = new UsuarioResponse(usuario);
            return ResponseEntity.ok(response);
        }catch (LoginException e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }

    @GetMapping
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Usuario get(@PathVariable Long id){
        return usuarioService.get(id);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @Valid @RequestBody UsuarioForm usuarioForm){
        return usuarioService.update(id, usuarioForm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }

}
