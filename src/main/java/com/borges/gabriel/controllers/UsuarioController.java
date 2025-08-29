package com.borges.gabriel.controllers;

import com.borges.gabriel.models.UsuarioEntity;
import com.borges.gabriel.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public UsuarioEntity buscarUsuario(@PathVariable Long id){
        return usuarioService.buscarUsuario(id);
    };

    @PostMapping
    public void criarUsuario(@RequestBody UsuarioEntity usuario){
        usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
    }

    @PutMapping("/{id}")
    public String atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioEntity usuario){
        return usuarioService.atualizarUsuario(id, usuario);
    }
}
