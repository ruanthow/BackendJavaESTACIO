package com.example.buffeProject.domain.SendMessage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMessage {

    private String urlPadrao;

    public SendMessage(SendMessageDTO data) {
        this.urlPadrao = "https://api.whatsapp.com/send/" + "?phone=" + data.number() + "&text=" + "Nome completo: "+ data.nome() + "%20%0A" + "Telefone: " + data.number() + "%20%0A" + "Ola quero alugar o seu salão de festas quanto custa ?" + "&type=phone_number&app_absent=0";
    }
}