package com.example.buffeProject.domain.Cliente;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Table(name = "cliente")
@Entity(name = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String telefone;
    private String senha;

    public Cliente(RequestClienteDTO requestCliente){
        this.nome = requestCliente.nome();
        this.telefone = requestCliente.telefone();
        this.senha = requestCliente.senha();
    }
}
