package com.patterns.bridge.abstraction;

import com.patterns.bridge.implementation.MessageSender;

public class EmailMessage extends Message {
    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
