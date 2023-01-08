package com.patterns.visitor.visitors;

import com.patterns.visitor.structure.OperaMailClient;
import com.patterns.visitor.structure.SquirrelMailClient;
import com.patterns.visitor.structure.ZimbraMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);

    void visit(SquirrelMailClient mailClient);

    void visit(ZimbraMailClient mailClient);
}
