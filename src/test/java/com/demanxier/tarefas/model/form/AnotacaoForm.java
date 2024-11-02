package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.TipoAnotacao;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnotacaoForm {
    @NotBlank(message = "O campo TITULO é obrigatório.")
    private String titulo;
    @NotBlank(message = "O campo CONTEUDO é obrigatório.")
    private String conteudo;
    private LocalDate dataCriacao;
    private TipoAnotacao tipoAnotacao;
}
