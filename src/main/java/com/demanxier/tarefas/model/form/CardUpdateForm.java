package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Arquivo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardUpdateForm {
    private String conteudo;
    private LocalDateTime atualizadoEm;

    private Arquivo id_arquivo;
    private Arquivo arquivo;
}
