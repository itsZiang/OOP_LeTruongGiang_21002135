package com.patterns.visitor.visitors;

import com.patterns.visitor.structure.OperaMailClient;
import com.patterns.visitor.structure.SquirrelMailClient;
import com.patterns.visitor.structure.ZimbraMailClient;

public class LinuxMailClientVisitor implements MailClientVisitor{
    @Override
    public void visit(OperaMailClient mailClient) {
        System.out.println("Configuration of Opera client for Linux complete");
    }

    @Override
    public void visit(SquirrelMailClient mailClient) {
        System.out.println("Configuration of Squirrel client for Linux complete");
    }

    @Override
    public void visit(ZimbraMailClient mailClient) {
        System.out.println("Configuration of Zimbra client for Linux complete");
    }
}
