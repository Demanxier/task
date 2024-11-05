package com.demanxier.tarefas.model;

import com.demanxier.tarefas.model.enuns.TipoGasto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_gasto")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal valor;
    private int parcelas;
    private LocalDate parcelasVencimentos;
    private LocalDate dataGastos;

    @Enumerated(EnumType.STRING)
    private TipoGasto tipoGasto;

    @ManyToOne
    @JoinColumn(name = "id_financa")
    private Financa financa;

    @ManyToOne
    private Cartao cartao;
}
