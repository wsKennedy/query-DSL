package com.example.querydsl.service;

import com.example.querydsl.model.Usuario;
import com.example.querydsl.repository.UsuarioRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<Usuario> all(Predicate predicate) {
        return repository.filtro(predicate);
    }
}
