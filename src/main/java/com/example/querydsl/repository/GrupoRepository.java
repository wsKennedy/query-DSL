package com.example.querydsl.repository;

import com.example.querydsl.model.Grupo;
import com.example.querydsl.model.QGrupo;
import com.example.querydsl.repository.base.IBaseRepository;
import com.example.querydsl.repository.usuario.UsuarioRepositoryQuery;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import javax.annotation.Nonnull;

public interface GrupoRepository extends IBaseRepository<Grupo, Long, QGrupo>, UsuarioRepositoryQuery {

    @Override
    default void customize(@Nonnull QuerydslBindings bindings, @Nonnull QGrupo root) {
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
        bindings.bind(root.uuid).as("id").withDefaultBinding();

    }

}
