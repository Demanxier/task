package com.demanxier.tarefas.response;

import com.demanxier.tarefas.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponse {

    private Long id;
    private String nome;
    private String email;

    public UsuarioResponse(Usuario usuario){
        this.id = usuario.getId();;
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }
}
