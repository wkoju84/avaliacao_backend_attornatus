package br.com.attornatus.avaliacaobackend.services;

import br.com.attornatus.avaliacaobackend.dtos.EnderecoDto;
import br.com.attornatus.avaliacaobackend.entities.Endereco;
import br.com.attornatus.avaliacaobackend.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository repository;

    @Transactional(readOnly = true)
    public List<EnderecoDto> buscarTodos(){
        List<Endereco> list = repository.findAll();
        return list.stream().map(x -> new EnderecoDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EnderecoDto buscarPorId(Integer id) {
        Optional<Endereco> objeto = repository.findById(id);
        Endereco entidade = objeto.get();
        return new EnderecoDto(entidade);
    }

    public void excluir(Integer id){

        repository.deleteById(id);
    }

    @Transactional
    public EnderecoDto inserir(EnderecoDto dto){
        Endereco entidade = new Endereco();
        entidade.setLogradouro(dto.getLogradouro());
        entidade.setCep(dto.getCep());
        entidade.setNumero(dto.getNumero());
        entidade.setCidade(dto.getCidade());
        entidade = repository.save(entidade);
        return new EnderecoDto(entidade);
    }

    @Transactional
    public EnderecoDto atualizar(Integer id, EnderecoDto dto){
        Endereco entidade = repository.getReferenceById(id);
        entidade.setLogradouro(dto.getLogradouro());
        entidade.setCep(dto.getCep());
        entidade.setNumero(dto.getNumero());
        entidade.setCidade(dto.getCidade());
        entidade = repository.save(entidade);
        return new EnderecoDto(entidade);
    }
}
