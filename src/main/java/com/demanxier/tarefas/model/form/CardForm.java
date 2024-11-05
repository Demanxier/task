package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Arquivo;
import com.demanxier.tarefas.model.Tarefa;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardForm {
    @NotBlank(message = "O campo CONTEUDO é obrigatório.")
    private String conteudo;
    private LocalDateTime criadoEm;

    private Long id_tarefa;
    private Tarefa tarefa;

    private Long id_arquivo;
    private List<Arquivo> arquivos;
}
