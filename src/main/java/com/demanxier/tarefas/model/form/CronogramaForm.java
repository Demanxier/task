package com.demanxier.tarefas.model.form;

import com.demanxier.tarefas.model.Tarefa;
import com.demanxier.tarefas.model.enuns.Categoria;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CronogramaForm {

    @NotBlank(message = "O campo TITULO é obrigatório.")
    private String titulo;

    @NotBlank(message = "O campo DESCRIÇÃO é obrigatório.")
    private String descricao;

    @NotBlank(message = "O campo DATA AÇÃO é obrigatório.")
    private LocalDate dataAcao;

    @NotBlank(message = "O campo HORA DE INICIO é obrigatório.")
    private LocalTime horIni;

    @NotBlank(message = "O campo HORA FIM é obrigatório.")
    private LocalTime horFim;

    private Categoria categoria;

    private Tarefa tarefa;
}
