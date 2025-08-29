package com.borges.gabriel.controllers;

import com.borges.gabriel.models.EnderecoEntity;
import com.borges.gabriel.models.UsuarioEntity;
import com.borges.gabriel.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/{id}")
    public EnderecoEntity buscarEndereco(@PathVariable Long id){
        return enderecoService.buscarEnderco(id);
    }

    @PostMapping
    public void criarEndereco(@RequestBody EnderecoEntity endereco){
        enderecoService.criarEndereco(endereco);
    }

    @DeleteMapping("/{id}")
    public void deletarEndereco(@PathVariable Long id){
        enderecoService.deletarEndereco(id);
    }

    @PutMapping("/{id}")
    public String atualizarEndereco(@PathVariable Long id, @RequestBody EnderecoEntity endereco){
        return enderecoService.atualizarEndereco(id,endereco);
    }
}
