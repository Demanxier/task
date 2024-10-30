package com.demanxier.tarefas.repository;

import com.demanxier.tarefas.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatosRepository extends JpaRepository<Gasto, Long> {
}
