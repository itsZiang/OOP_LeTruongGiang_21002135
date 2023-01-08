package com.patterns.visitor.structure;

import com.patterns.visitor.visitors.MailClientVisitor;

public interface MailClient {
    void sendMail(String[] mailInfo);

    void receiveMail(String[] mailInfo);

    boolean accept(MailClientVisitor visitor);
}
