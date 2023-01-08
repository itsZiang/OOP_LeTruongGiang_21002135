package com.patterns.visitor.visitors;

import com.patterns.visitor.structure.OperaMailClient;
import com.patterns.visitor.structure.SquirrelMailClient;
import com.patterns.visitor.structure.ZimbraMailClient;

public class MailClientVisitorTest {
    private MacMailClientVisitor macVisitor;
    private LinuxMailClientVisitor linuxVisitor;
    private WindowsMailClientVisitor windowsVisitor;
    private OperaMailClient operaMailClient;
    private SquirrelMailClient squirrelMailClient;
    private ZimbraMailClient zimbraMailClient;

    public static void main(String[] args) throws Exception {
        MailClientVisitorTest mailClientVisitorTest = new MailClientVisitorTest();
        mailClientVisitorTest.setup();

        mailClientVisitorTest.testOperaClientTest();
        mailClientVisitorTest.testSquirrelClientTest();
        mailClientVisitorTest.testZimbraClientTest();
    }

    public void setup() {
        macVisitor = new MacMailClientVisitor();
        linuxVisitor = new LinuxMailClientVisitor();
        windowsVisitor = new WindowsMailClientVisitor();
        operaMailClient = new OperaMailClient();
        squirrelMailClient = new SquirrelMailClient();
        zimbraMailClient = new ZimbraMailClient();
    }

    public void testOperaClientTest() throws Exception {
        System.out.println("---Testing Opera Mail Client for difference environments---");
        operaMailClient.accept(macVisitor);
        operaMailClient.accept(linuxVisitor);
        operaMailClient.accept(windowsVisitor);
    }

    public void testSquirrelClientTest() throws Exception {
        System.out.println("---Testing Squirrel Mail Client for difference environments---");
        squirrelMailClient.accept(macVisitor);
        squirrelMailClient.accept(linuxVisitor);
        squirrelMailClient.accept(windowsVisitor);
    }

    public void testZimbraClientTest() throws Exception {
        System.out.println("---Testing Zimbra Mail Client for difference environments---");
        zimbraMailClient.accept(macVisitor);
        zimbraMailClient.accept(linuxVisitor);
        zimbraMailClient.accept(windowsVisitor);
    }


}
