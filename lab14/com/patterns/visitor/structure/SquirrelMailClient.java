package com.patterns.visitor.structure;

import com.patterns.visitor.visitors.MailClientVisitor;

public class SquirrelMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: Receiving mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}
