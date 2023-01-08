package command.demoprogram;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Command startCommand = new StartCommand(computer);
        Command shutDownCommand = new ShutDownCommand(computer);
        Command restartCommand = new RestartCommand(computer);

        Switch mySwitch = new Switch();
        mySwitch.storeAndExecute(startCommand);
        mySwitch.storeAndExecute(restartCommand);
        mySwitch.storeAndExecute(shutDownCommand);
    }
}
