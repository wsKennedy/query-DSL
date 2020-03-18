package com.example.querydsl.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "usuario", schema = "acesso")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String nome;
    private String email;

    public Usuario() { }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
