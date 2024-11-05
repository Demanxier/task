package com.demanxier.tarefas.repository;

import com.demanxier.tarefas.model.Financa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancaRepository extends JpaRepository<Financa, Long> {
}
