package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.TipoCartao;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoForm {

    @NotBlank(message = "O campo NOME é obrigatório.")
    private String nome;
    private BigDecimal limite;

    @NotBlank(message = "O campo TIPO CARTÃO é obrigatório.")
    private TipoCartao tipoCartao;
    private BigDecimal saldoUsado = BigDecimal.ZERO;
}
