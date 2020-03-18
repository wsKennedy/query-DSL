package com.example.querydsl.repository.grupo;



import com.example.querydsl.model.Grupo;
import com.example.querydsl.model.Usuario;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface GrupoRepositoryQuery {

    public List<Grupo> filtro(Predicate filter);
}
