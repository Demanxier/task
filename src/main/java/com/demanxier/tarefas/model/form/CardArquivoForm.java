package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Arquivo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardArquivoForm {

    private Long id_arquivo;
    private List<Arquivo> arquivoList;
}
