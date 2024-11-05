package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.NivelAcesso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioForm {

    @NotBlank(message = "Campo NOME é obrigatório.")
    @Size(min = 5, max = 100, message = "'${validatedValue}' precisa estar entre '${min}' e '${max}'.")
    private String nome;

    @NotBlank(message = "Campo E-MAIL é obrigatório.")
    @Size(min = 5, max = 300, message = "'${validatedValue}' precisa estar entre '${min}' e '${max}'.")
    private String email;

    @NotBlank(message = "Campo SENHA é obrigatório.")
    @Size(min = 5, max = 100, message = "'${validatedValue}' precisa estar entre '${min}' e '${max}'.")
    private String senha;

    private NivelAcesso nivelAcesso;
}
