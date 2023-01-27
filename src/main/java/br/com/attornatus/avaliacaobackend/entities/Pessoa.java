package br.com.attornatus.avaliacaobackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String dataNascimento;
    private boolean enderecoAtual;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String dataNascimento, boolean enderecoAtual) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.enderecoAtual = enderecoAtual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(boolean enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }
}
