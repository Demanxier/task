package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Financa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceitaForm {

    private String descricao;
    private BigDecimal valor;
    private LocalDate dataRecebimento;

    private Financa financa;
}
