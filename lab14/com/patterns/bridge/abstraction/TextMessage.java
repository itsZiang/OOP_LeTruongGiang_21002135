package com.patterns.bridge.abstraction;

import com.patterns.bridge.implementation.MessageSender;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
