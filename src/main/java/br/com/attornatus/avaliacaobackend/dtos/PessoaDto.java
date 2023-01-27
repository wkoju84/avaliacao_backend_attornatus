package br.com.attornatus.avaliacaobackend.dtos;

import br.com.attornatus.avaliacaobackend.entities.Pessoa;

import java.io.Serial;
import java.io.Serializable;

public class PessoaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String dataNascimento;
    private boolean enderecoAtual;

    public PessoaDto() {
    }

    public PessoaDto(Integer id, String nome, String dataNascimento, boolean enderecoAtual) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.enderecoAtual = enderecoAtual;
    }

    public PessoaDto(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.dataNascimento = pessoa.getDataNascimento();
        this.enderecoAtual = pessoa.isEnderecoAtual();
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
