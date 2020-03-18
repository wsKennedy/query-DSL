package com.example.querydsl.resource;

import com.example.querydsl.model.Usuario;
import com.example.querydsl.service.UsuarioService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    UsuarioService service;

    @GetMapping
    public List<Usuario> all(@QuerydslPredicate Predicate predicate) {
        return service.all(predicate);
    }
}
