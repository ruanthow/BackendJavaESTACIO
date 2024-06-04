package com.example.buffeProject.controller;


import com.example.buffeProject.domain.Pedido.Pedido;
import com.example.buffeProject.domain.Pedido.PedidoRepository;
import com.example.buffeProject.domain.Pedido.RequestPedidoDTO;
import com.example.buffeProject.domain.SendMessage.SendMessage;
import com.example.buffeProject.domain.SendMessage.SendMessageDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository repository;

    @GetMapping
    @Transactional
    public ResponseEntity getAll() {
        List<Pedido> pedidoList = repository.findAll();
        return ResponseEntity.ok(pedidoList);
    }

    @CrossOrigin
    @PostMapping
    @Transactional
    public ResponseEntity<SendMessageDTO> createPedido(@RequestBody @Valid RequestPedidoDTO data) {
        Pedido pedido = new Pedido(data);
        SendMessage message = new SendMessage(pedido);
        repository.save(pedido);
        SendMessageDTO dto = new SendMessageDTO(message);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
