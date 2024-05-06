package com.example.buffeProject.domain.Pedido;

import java.util.Date;
import java.util.TimeZone;

public record RequestPedidoDTO(String nome, Integer qtd_pessoas, Date data_evento, Date data_visita, Boolean buffe, String telefone, String pedido_aceito) {
}
