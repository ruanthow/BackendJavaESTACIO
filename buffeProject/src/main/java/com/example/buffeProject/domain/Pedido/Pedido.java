package com.example.buffeProject.domain.Pedido;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "pedido")
@Entity(name = "pedidos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedido {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private Integer qtdPessoas;
    private Date dataEvento;
    private String tipoEvento;
    private String telefone;
    private String pedidoAceito;

    public Pedido(RequestPedidoDTO data){
        this.nome = data.nome();
        this.qtdPessoas = data.qtd_pessoas();
        this.dataEvento = data.data_evento();
        this.tipoEvento = data.tipo_evento();
        this.telefone = data.telefone();
        this.pedidoAceito = data.pedido_aceito();
    }
}
