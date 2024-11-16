package com.taskmanager.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    // Getter para id
    public Long getId() {
        return id;
    }

    // Getter para titulo
    public String getTitulo() {
        return titulo;
    }

    // Setter para titulo com validação
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }
    }

    // Getter para descricao
    public String getDescricao() {
        return descricao;
    }

    // Setter para descricao com validação
    public void setDescricao(String descricao) {
        this.descricao = descricao; // Você pode adicionar validações aqui se necessário.
    }
}