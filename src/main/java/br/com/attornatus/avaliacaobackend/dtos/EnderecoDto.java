package br.com.attornatus.avaliacaobackend.dtos;

import br.com.attornatus.avaliacaobackend.entities.Endereco;
import br.com.attornatus.avaliacaobackend.entities.Pessoa;

import java.io.Serial;
import java.io.Serializable;

public class EnderecoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;

    public EnderecoDto() {
    }

    public EnderecoDto(Integer id, String logradouro, String cep, String numero, String cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public EnderecoDto(Endereco endereco) {
        this.id = endereco.getId();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
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