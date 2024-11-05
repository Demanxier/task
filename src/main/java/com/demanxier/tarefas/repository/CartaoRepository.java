package com.demanxier.tarefas.repository;

import com.demanxier.tarefas.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
}
