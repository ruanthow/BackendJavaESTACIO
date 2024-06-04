package com.example.buffeProject.domain.SendMessage;

import com.example.buffeProject.domain.Pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMessage {
    private String nome;
    private String numero;
    private String contato;
    private Integer qtdPessoa;
    private String tipoEvento;
    private Date date;
    private String url;

    public SendMessage(Pedido data){
        this.nome = data.getNome();
        this.numero = data.getTelefone();
        this.contato = "21983828052";
        this.qtdPessoa = data.getQtdPessoas();
        this.date = data.getDataEvento();
        this.tipoEvento = data.getTipoEvento();
        this.url = createURL();

    }

    public String createURL(){
        return "https://api.whatsapp.com/send/" + "?phone=55" + this.getContato() + "&text=" + "Nome completo: "+ this.getNome() + "%20%0A" + "Telefone: 55" + this.getNumero() + "%20%0A" + "Olá entrei em contato por meio do seu site tenho interesse em saber como funciona alugando o "+ this.getTipoEvento() + " ?" + "&type=phone_number&app_absent=0";
    }
}

