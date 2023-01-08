package bridge.demoprogram;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startUp() {
        System.out.println("WindowsOS start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge");
    }
}
