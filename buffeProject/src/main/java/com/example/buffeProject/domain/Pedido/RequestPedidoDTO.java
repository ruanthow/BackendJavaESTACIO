package com.example.buffeProject.domain.Pedido;

import java.util.Date;
import java.util.TimeZone;

public record RequestPedidoDTO(String name, Integer qtdPessoas, Date data, String hora, String endereco, String mensagem, String telefone, String pedidoAceito) {
}
