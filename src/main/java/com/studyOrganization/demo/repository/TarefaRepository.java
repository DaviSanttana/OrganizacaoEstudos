package com.studyOrganization.demo.repository;

import org.springframework.stereotype.Repository;
import com.studyOrganization.demo.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
