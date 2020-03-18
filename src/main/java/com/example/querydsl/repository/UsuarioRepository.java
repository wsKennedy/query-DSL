package com.example.querydsl.repository;

import com.example.querydsl.model.QUsuario;
import com.example.querydsl.model.Usuario;
import com.example.querydsl.repository.base.IBaseRepository;
import com.example.querydsl.repository.usuario.UsuarioRepositoryQuery;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import javax.annotation.Nonnull;

public interface UsuarioRepository extends IBaseRepository<Usuario, Long, QUsuario>, UsuarioRepositoryQuery {

    @Override
    default void customize(@Nonnull QuerydslBindings bindings, @Nonnull QUsuario root) {
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
        bindings.bind(root.uuid).as("id").withDefaultBinding();

    }

}
