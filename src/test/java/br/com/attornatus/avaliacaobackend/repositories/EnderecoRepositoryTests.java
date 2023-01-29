package br.com.attornatus.avaliacaobackend.repositories;

import br.com.attornatus.avaliacaobackend.entities.Endereco;
import br.com.attornatus.avaliacaobackend.entities.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class EnderecoRepositoryTests {

    @Autowired
    private EnderecoRepository repository;

    private Integer idExistente;
    private Integer idNaoExistente;

    @BeforeEach
    void setup() throws Exception {

        idExistente = 1;
        idNaoExistente = 99;
    }

    @Test
    public void procurarPorIdERetornarUmEndereco(){
        Optional<Endereco> resultado = repository.findById(idExistente);
        Assertions.assertTrue(resultado.isPresent());
    }

    @Test
    public void procurarPorIdERetornarUmOptionalVazio(){
        Optional<Endereco> resultado = repository.findById(idNaoExistente);
        Assertions.assertTrue(resultado.isEmpty());
    }
}
