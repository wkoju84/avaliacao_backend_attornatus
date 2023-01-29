package br.com.attornatus.avaliacaobackend.controllers;

import br.com.attornatus.avaliacaobackend.dtos.EnderecoDto;
import br.com.attornatus.avaliacaobackend.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    EnderecoService service;

    @GetMapping
    public ResponseEntity<List<EnderecoDto>> buscarTodosOsEnderecos() {
        List<EnderecoDto> list = service.buscarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EnderecoDto> buscarEnderecoPorId(@PathVariable Integer id){
        EnderecoDto dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirEndereco(@PathVariable Integer id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<EnderecoDto> inserirEndereco(@RequestBody EnderecoDto dto){
        dto = service.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<EnderecoDto> atualizarEndereco(@PathVariable Integer id,
                                                     @RequestBody EnderecoDto dto){
        dto = service.atualizar(id, dto);
        return ResponseEntity.ok().body(dto);
    }
}
