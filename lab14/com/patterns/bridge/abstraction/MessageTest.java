package com.patterns.bridge.abstraction;

import com.patterns.bridge.implementation.EmailMessageSender;
import com.patterns.bridge.implementation.MessageSender;
import com.patterns.bridge.implementation.TextMessageSender;

public class MessageTest {
    public static void main(String[] args) {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
