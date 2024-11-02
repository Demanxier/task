package com.demanxier.tarefas.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioLoginForm {
    private String nome;
    private String senha;
}
