package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.enuns.Prioridade;
import com.demanxier.tarefas.model.enuns.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaForm {
    @NotBlank(message = "Campo TITULO é obrigatório.")
    @Size(min = 5, max = 100, message = "'${validatedValue}' precisa estar entre '${min}' e '${max}'.")
    private String titulo;

    @NotBlank(message = "Campo DESCRIÇÃO é obrigatório.")
    @Size(min = 5, max = 500000, message = "'${validatedValue}' precisa estar entre '${min}' e '${max}'.")
    private String descricao;

    @NotBlank(message = "Campo DATA é obrigatório.")
    private LocalDate dataCriacao;
    private LocalDateTime agendamento;
    private LocalDate dataConclusao;
    private LocalDate dataVencimento;
    private Double custo;
    private boolean recorrencia;
    private Status status;
    private Prioridade prioridade;

    private Long id_AreaAtuacao;
    private Long id_usuario;
    private Long id_cards;
}
