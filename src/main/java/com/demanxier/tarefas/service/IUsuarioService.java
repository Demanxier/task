package com.demanxier.tarefas.service;

import com.demanxier.tarefas.model.Usuario;
import com.demanxier.tarefas.model.form.UsuarioForm;
import com.demanxier.tarefas.model.form.UsuarioLoginForm;

import javax.security.auth.login.LoginException;
import java.util.List;

public interface IUsuarioService {
    Usuario create(UsuarioForm usuarioForm);
    Usuario get(Long id);
    List<Usuario> getAll();
    Usuario update(Long id, UsuarioForm usuarioForm);
    void delete (Long id);
    Usuario login(UsuarioLoginForm usuarioLoginForm) throws LoginException;
}
