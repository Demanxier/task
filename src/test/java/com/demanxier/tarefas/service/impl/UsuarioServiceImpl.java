package com.demanxier.tarefas.service.impl;

import com.demanxier.tarefas.model.Usuario;
import com.demanxier.tarefas.model.enuns.NivelAcesso;
import com.demanxier.tarefas.model.form.UsuarioForm;
import com.demanxier.tarefas.model.form.UsuarioLoginForm;
import com.demanxier.tarefas.repository.UsuarioRepository;
import com.demanxier.tarefas.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(UsuarioForm usuarioForm) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioForm.getNome());
        usuario.setEmail(usuarioForm.getEmail());
        usuario.setSenha(usuarioForm.getSenha());
        usuario.setNivelAcesso(NivelAcesso.ADMIN);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario get(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario update(Long id, UsuarioForm usuarioForm) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuário não encontrado."));

        usuario.setNome(usuarioForm.getNome());
        usuario.setEmail(usuarioForm.getEmail());
        usuario.setSenha(usuarioForm.getSenha());
        usuario.setNivelAcesso(NivelAcesso.BASICO);
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuário não encontrado."));
        usuarioRepository.delete(usuario);
    }

    @Override
    public Usuario login(UsuarioLoginForm usuarioLoginForm) throws LoginException {
        Usuario usuario = usuarioRepository.findByNome(usuarioLoginForm.getNome());

        if(usuario != null && usuario.getSenha().equals(usuarioLoginForm.getSenha())){
            return usuario;
        }else {
            throw new LoginException("Nome ou senha inválidos.");
        }
    }
}
