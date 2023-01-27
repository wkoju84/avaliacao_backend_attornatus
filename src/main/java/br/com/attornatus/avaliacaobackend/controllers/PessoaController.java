package br.com.attornatus.avaliacaobackend.controllers;

import br.com.attornatus.avaliacaobackend.dtos.PessoaDto;
import br.com.attornatus.avaliacaobackend.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping
    public ResponseEntity<List<PessoaDto>> buscarTodasAsPessoas() {
        List<PessoaDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaDto> buscarPessoaPorId(@PathVariable Integer id){
        PessoaDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirPessoa(@PathVariable Integer id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<PessoaDto> inserirPessoa(@RequestBody PessoaDto dto){
        dto = service.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
