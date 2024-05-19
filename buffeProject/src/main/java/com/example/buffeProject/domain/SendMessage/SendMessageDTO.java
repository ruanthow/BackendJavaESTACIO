package com.example.buffeProject.domain.SendMessage;

import com.example.buffeProject.domain.Pedido.Pedido;

public record SendMessageDTO(String url) {
    public SendMessageDTO(SendMessage message){
        this(message.createURL());
    }
}
