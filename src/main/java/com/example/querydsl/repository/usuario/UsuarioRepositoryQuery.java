package com.example.querydsl.repository.usuario;



import com.example.querydsl.model.Usuario;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface UsuarioRepositoryQuery {

    public List<Usuario> filtro(Predicate filter);
}
