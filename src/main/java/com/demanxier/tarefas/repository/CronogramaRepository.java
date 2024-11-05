package com.demanxier.tarefas.repository;

import com.demanxier.tarefas.model.Cronograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CronogramaRepository extends JpaRepository<Cronograma, Long> {
}
