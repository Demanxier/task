package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.NivelAcesso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioForm {
    private String nome;
    private String email;
    private String senha;
    private NivelAcesso nivelAcesso;
}
