package com.example.buffeProject.domain.SendMessage;


public class SendMessage {
    // Find your Account Sid and Token at twilio.com/console
    private String urlPadrao = "https://api.whatsapp.com/send/";
    private String criandoUrl = "";
    public String Send(String text, String number) {
        this.criandoUrl = this.urlPadrao + "?phone=" + number + "&text=" + text + "&type=phone_number&app_absent=0";
        return this.criandoUrl;
    }
}