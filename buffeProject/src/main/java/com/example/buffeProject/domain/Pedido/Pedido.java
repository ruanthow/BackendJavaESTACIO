package com.example.buffeProject.domain.Pedido;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "pedido")
@Entity(name = "pedidos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedido {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private Integer qtdPessoas;
    private Date data;
    private String hora;
    private String endereco;
    private String mensagem;
    private String telefone;
    private String pedidoAceito;

    public Pedido(RequestPedidoDTO data){
        this.nome = data.name();
        this.qtdPessoas = data.qtdPessoas();
        this.data = data.data();
        this.endereco = data.endereco();
        this.mensagem = data.mensagem();
        this.telefone = data.telefone();
        this.hora = data.hora();
        this.pedidoAceito = data.pedidoAceito();
    }
}
