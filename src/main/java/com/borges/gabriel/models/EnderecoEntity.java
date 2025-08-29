package com.borges.gabriel.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private String bairro;
    private String cep;
    private int numero;

    @OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL)
    private List<UsuarioEntity> usuarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }
}
