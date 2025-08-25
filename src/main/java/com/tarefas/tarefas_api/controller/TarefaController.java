package com.tarefas.tarefas_api.controller;

import com.tarefas.tarefas_api.model.Tarefa;
import com.tarefas.tarefas_api.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    // Criar
    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }

    // Listar todas
    @GetMapping
    public List<Tarefa> listar() {
        return repository.findAll();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        return repository.findById(id).map(t -> {
            t.setNome(tarefaAtualizada.getNome());
            t.setDataEntrega(tarefaAtualizada.getDataEntrega());
            t.setResponsavel(tarefaAtualizada.getResponsavel());
            return repository.save(t);
        }).orElse(null);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        repository.deleteById(id);
        return "Tarefa removida com sucesso!";
    }
}