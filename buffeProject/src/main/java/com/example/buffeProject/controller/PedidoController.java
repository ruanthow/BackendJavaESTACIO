package com.example.buffeProject.controller;


import com.example.buffeProject.domain.Pedido.Pedido;
import com.example.buffeProject.domain.Pedido.PedidoRepository;
import com.example.buffeProject.domain.Pedido.RequestPedidoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository repository;

    @GetMapping
    public ResponseEntity getAll(){
        List<Pedido> pedidoList = repository.findAll();
        return ResponseEntity.ok(pedidoList);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity createPedido(@RequestBody @Valid RequestPedidoDTO data){
        Pedido pedido = new Pedido(data);
        repository.save(pedido);
        return ResponseEntity.ok().build();
    }
}
