package com.example.buffeProject.controller;


import com.example.buffeProject.domain.Pedido.Pedido;
import com.example.buffeProject.domain.Pedido.PedidoRepository;
import com.example.buffeProject.domain.Pedido.RequestPedidoDTO;
import com.example.buffeProject.domain.SendMessage.SendMessage;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
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
    @PostMapping
    public ResponseEntity createPedido(@RequestBody @Valid RequestPedidoDTO data) {
        Pedido pedido = new Pedido(data);
        SendMessage message = new SendMessage();
        var result = message.Send("Nome completo: "+ pedido.getNome() + "%20%0A" + "Telefone: " + pedido.getTelefone() + "%20%0A" + "Ola quero alugar o seu salão de festas quanto custa ?", "21983419689");
        return ResponseEntity.ok(result);
    }
}
