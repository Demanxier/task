package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Gasto;
import com.demanxier.tarefas.model.Receita;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinancaForm {

    private List<Receita> receitas;
    private List<Gasto> gastos;

}
