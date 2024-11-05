package com.demanxier.tarefas.model;

import com.demanxier.tarefas.model.enuns.TipoCartao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cartao")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private BigDecimal limite;

    @Enumerated(EnumType.STRING)
    private TipoCartao tipoCartao;
    private BigDecimal saldoUsado = BigDecimal.ZERO;
}
