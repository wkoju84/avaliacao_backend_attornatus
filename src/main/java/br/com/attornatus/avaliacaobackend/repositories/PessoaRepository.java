package br.com.attornatus.avaliacaobackend.repositories;

import br.com.attornatus.avaliacaobackend.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
