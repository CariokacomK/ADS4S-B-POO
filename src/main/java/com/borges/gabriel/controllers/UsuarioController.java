package com.borges.gabriel.controllers;

import com.borges.gabriel.models.UsuarioEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/usuario")
public class UsuarioController {

    @GetMapping("/${id}")
    public UsuarioEntity buscarUsuario(@PathVariable Long id){
        return
    }

    @PostMapping
    public void criarUsuario(@RequestBody UsuarioEntity usuario){

    }

    @DeleteMapping("/${id}")
    public void deletarUsuario(@PathVariable Long id){

    }

    @PutMapping("/${id}")
    public void atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioEntity usuario){

    }
}
