package com.studyOrganization.demo.controller;

import com.studyOrganization.demo.model.Tarefa;
import com.studyOrganization.demo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas") //localhost:8080/tarefas
public class TarefaController {
    @Autowired
    private TarefaRepository repository;

    @GetMapping
    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }
    @PutMapping("/{id}/concluir")
    public Tarefa concluir(@PathVariable Long id) {
        Tarefa tarefa = repository.findById(id).orElseThrow();
        tarefa.setConcluida(!tarefa.isConcluida());
        return repository.save(tarefa);
    }
}

