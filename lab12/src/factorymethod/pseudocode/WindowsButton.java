package factorymethod.pseudocode;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render button in Windows style");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a native OS click event");
    }
}
