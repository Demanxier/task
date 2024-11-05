package com.demanxier.tarefas.repository;

import com.demanxier.tarefas.model.AreaAtuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaAtuacaoRepository extends JpaRepository<AreaAtuacao, Long> {
}
