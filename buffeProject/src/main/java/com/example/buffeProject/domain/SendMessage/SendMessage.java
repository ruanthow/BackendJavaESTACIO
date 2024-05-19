package com.example.buffeProject.domain.SendMessage;

import com.example.buffeProject.domain.Pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMessage {
    private String nome;
    private String numero;
    private String contato;
    private String url;

    public SendMessage(Pedido data){
        this.nome = data.getNome();
        this.numero = data.getTelefone();
        this.contato = "21983828052";
        this.url = createURL();

    }

    public String createURL(){
        return "https://api.whatsapp.com/send/" + "?phone=" + this.contato + "&text=" + "Nome completo: "+ this.nome + "%20%0A" + "Telefone: " + this.numero + "%20%0A" + "Ola quero alugar o seu salão de festas quanto custa ?" + "&type=phone_number&app_absent=0";
    }
}

