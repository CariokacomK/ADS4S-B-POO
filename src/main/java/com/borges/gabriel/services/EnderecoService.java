package com.borges.gabriel.services;

import com.borges.gabriel.models.EnderecoEntity;
import com.borges.gabriel.models.UsuarioEntity;
import com.borges.gabriel.repositories.EnderecoRepository;
import com.borges.gabriel.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoEntity buscarEnderco(Long id){
        return enderecoRepository.findById(id).orElse(null);
    }

    public void criarEndereco(EnderecoEntity endereco){
        enderecoRepository.save(endereco);
    }

    public void deletarEndereco(Long id){
        enderecoRepository.deleteById(id);
    }

    public String atualizarEndereco(Long id, EnderecoEntity endereco){
        var enderecoOpt = enderecoRepository.findById(id).orElse(null);

        if(endereco != null){
            enderecoOpt.setBairro(endereco.getBairro());
            enderecoOpt.setCep(endereco.getCep());
            enderecoOpt.setNumero(endereco.getNumero());
            enderecoOpt.setRua(endereco.getRua());

            enderecoRepository.save(enderecoOpt);

            return "Endereco adicionado";
        }else{
            return "Endereco não encontrado";
        }
    }
}
