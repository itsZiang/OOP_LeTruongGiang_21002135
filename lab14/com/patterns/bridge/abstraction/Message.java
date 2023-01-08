package com.patterns.bridge.abstraction;

import com.patterns.bridge.implementation.MessageSender;

public abstract class Message {
    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}
