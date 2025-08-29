package com.borges.gabriel.controllers;

import com.borges.gabriel.models.EnderecoEntity;
import com.borges.gabriel.models.UsuarioEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/endereco")
public class EnderecoController {

    @GetMapping("/${id}")
    public EnderecoEntity buscarEndereco(@PathVariable Long id){
        return
    }

    @PostMapping
    public void criarEndereco(@RequestBody EnderecoEntity endereco){

    }

    @DeleteMapping("/${id}")
    public void deletarEndereco(@PathVariable Long id){

    }

    @PutMapping("/${id}")
    public void atualizarEndereco(@PathVariable Long id, @RequestBody EnderecoEntity endereco){

    }
}
