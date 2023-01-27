package br.com.attornatus.avaliacaobackend.services;

import br.com.attornatus.avaliacaobackend.dtos.PessoaDto;
import br.com.attornatus.avaliacaobackend.entities.Pessoa;
import br.com.attornatus.avaliacaobackend.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;
@Transactional(readOnly = true)
    public List<PessoaDto> buscarTodos(){
        List<Pessoa> list = repository.findAll();
        return list.stream().map(x -> new PessoaDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public PessoaDto buscarPorId(Integer id) {
        Optional<Pessoa> objeto = repository.findById(id);
        Pessoa entidade = objeto.get();
        return new PessoaDto(entidade);
    }

    public void excluir(Integer id){

        repository.deleteById(id);
    }
    @Transactional
    public PessoaDto inserir(PessoaDto dto){
        Pessoa entidade = new Pessoa();
        entidade.setNome(dto.getNome());
        entidade.setDataNascimento(dto.getDataNascimento());
        entidade.setEnderecoAtual(dto.isEnderecoAtual());
        entidade = repository.save(entidade);
        return new PessoaDto(entidade);
    }
}
