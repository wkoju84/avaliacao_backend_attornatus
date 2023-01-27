package br.com.attornatus.avaliacaobackend.entities;

import java.io.Serial;
import java.io.Serializable;

public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;


    public Endereco() {
    }

    public Endereco(Integer id, String logradouro, String cep, String numero, String cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
