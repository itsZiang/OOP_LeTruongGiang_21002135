package bridge.demoprogram;

public class MacOS implements OperatingSystem {
    @Override
    public void startUp() {
        System.out.println("Mac start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Safari");
    }
}
