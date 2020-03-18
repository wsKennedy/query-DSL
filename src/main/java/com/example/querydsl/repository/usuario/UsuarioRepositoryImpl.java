package com.example.querydsl.repository.usuario;

import com.example.querydsl.model.QUsuario;
import com.example.querydsl.model.Usuario;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UsuarioRepositoryImpl implements UsuarioRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Usuario> filtro(Predicate filter) {
        JPAQuery<Usuario> query = new JPAQuery<>(manager);
        QUsuario usuario = new QUsuario("usuario");
        return query.select(usuario).from(usuario).where(filter).fetch();
    }
}
