package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Cartao;
import com.demanxier.tarefas.model.Financa;
import com.demanxier.tarefas.model.enuns.TipoGasto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GastoForm {

    @NotBlank(message = "O campo DESCRIÇÃO é obrigatório.")
    private String descricao;
    @NotBlank(message = "O campo VALOR é obrigatório")
    private BigDecimal valor;
    private int parcelas;
    private LocalDate parcelasVencimentos;
    private LocalDate dataGastos;

    @NotBlank(message = "O campo TIPO GASTO é obrigatório")
    private TipoGasto tipoGasto;

    private Financa financa;
    private Cartao cartao;
}
