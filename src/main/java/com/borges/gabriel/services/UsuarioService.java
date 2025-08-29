package com.borges.gabriel.services;

import com.borges.gabriel.models.UsuarioEntity;
import com.borges.gabriel.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioEntity buscarUsuario(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public void criarUsuario(UsuarioEntity usuario){
        usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }

    public String atualizarUsuario(Long id, UsuarioEntity usuario){
        var usuarioOpt = usuarioRepository.findById(id).orElse(null);

        if(usuarioOpt != null){
            usuarioOpt.setEndereco(usuario.getEndereco());
            usuarioOpt.setIdade(usuario.getIdade());
            usuarioOpt.setNome(usuario.getNome());

            usuarioRepository.save(usuarioOpt);

            return "Usuario adicionado";
        }else{
            return "Usuario não encontrado";
        }
    }
}
