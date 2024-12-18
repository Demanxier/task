package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArquivoForm {

    private String nome;
    private String tipo;

    private byte[] conteudo;

    private Long id_card;
    private Card card;
}
