package com.tarefas.tarefas_api.repository;

import com.tarefas.tarefas_api.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

// Classe que herda da interface JpaRepository criada para realizar operações CRUD no banco de dados
public interface TarefaRepository extends JpaRepository<Tarefa, Long> { }