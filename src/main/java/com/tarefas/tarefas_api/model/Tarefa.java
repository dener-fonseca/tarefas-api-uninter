package com.tarefas.tarefas_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;

// Classe que usa a anotação entidade para mapear dados na tabela tarefas do banco de dados
@Entity
public class Tarefa {

    // Identificador da tarefa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Atributos da tarefa
    private String nome;
    private LocalDate dataEntrega;
    private String responsavel;

    public Tarefa() {}

    public Tarefa(String nome, LocalDate dataEntrega, String responsavel) {
        this.nome = nome;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
    }

    // Getters e Setters dos atributos da tarefa
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getDataEntrega() { return dataEntrega; }
    public void setDataEntrega(LocalDate dataEntrega) { this.dataEntrega = dataEntrega; }

    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}