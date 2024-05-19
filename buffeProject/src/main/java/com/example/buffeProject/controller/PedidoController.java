package com.example.buffeProject.controller;


import com.example.buffeProject.domain.Pedido.Pedido;
import com.example.buffeProject.domain.Pedido.PedidoRepository;
import com.example.buffeProject.domain.Pedido.RequestPedidoDTO;
import com.example.buffeProject.domain.SendMessage.SendMessage;
import com.example.buffeProject.domain.SendMessage.SendMessageDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository repository;

    @GetMapping
    public ResponseEntity getAll() {
        List<Pedido> pedidoList = repository.findAll();

        return ResponseEntity.ok(pedidoList);
    }

    @CrossOrigin
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SendMessage> createPedido(@RequestBody @Valid RequestPedidoDTO data) {
        Pedido pedido = new Pedido(data);
        SendMessageDTO msg = new SendMessageDTO(pedido.getTelefone(), pedido.getNome());
        SendMessage message = new SendMessage(msg);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
