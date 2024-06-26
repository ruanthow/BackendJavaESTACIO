package com.example.buffeProject.controller;

import com.example.buffeProject.domain.Cliente.Cliente;
import com.example.buffeProject.domain.Cliente.ClienteCustomRepository;
import com.example.buffeProject.domain.Cliente.ClienteRepository;
import com.example.buffeProject.domain.Cliente.RequestClienteDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")

public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteCustomRepository customRepository;

    @GetMapping
    @Transactional
    public ResponseEntity getClienteAll(){
        List<Cliente> clienteList = repository.findAll();
        return ResponseEntity.ok(clienteList);
   }

    @GetMapping("/filtro")
    @Transactional
    public ResponseEntity getClienteByName(@RequestParam("name") String name) {
        List<Cliente> res = customRepository.filterByName(name);
        return ResponseEntity.ok(res);
    }

   @PostMapping
   @Transactional
    public ResponseEntity createCliente(@RequestBody @Valid RequestClienteDTO data){
        Cliente cliente = new Cliente(data);
        repository.save(cliente);
        return ResponseEntity.ok().build();
   }
}
