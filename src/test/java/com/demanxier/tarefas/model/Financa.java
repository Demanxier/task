package com.demanxier.tarefas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_financa")
public class Financa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "financa", cascade = CascadeType.ALL)
    private List<Receita> receitas;

    @OneToMany(mappedBy = "financa", cascade = CascadeType.ALL)
    private List<Gasto> gastos;

    private BigDecimal totalReceita = BigDecimal.ZERO;
    private BigDecimal totalGasto = BigDecimal.ZERO;

    public void atualizarTotais(){
        totalReceita = receitas.stream().map(Receita::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
        totalGasto = gastos.stream().map(Gasto::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
