package com.example.querydsl.repository.grupo;

import com.example.querydsl.model.Grupo;
import com.example.querydsl.model.QGrupo;
import com.example.querydsl.model.QUsuario;
import com.example.querydsl.model.Usuario;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GrupoRepositoryImpl implements GrupoRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Grupo> filtro(Predicate filter) {
        JPAQuery<Grupo> query = new JPAQuery<>(manager);
        QGrupo grupo = new QGrupo("grupo");
        return query.select(grupo).from(grupo).where(filter).fetch();
    }
}
