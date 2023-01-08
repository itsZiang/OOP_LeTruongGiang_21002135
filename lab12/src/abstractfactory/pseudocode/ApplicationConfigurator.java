package abstractfactory.pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String configOS = System.getProperty("os.name").toLowerCase();;
        //        String configOS = "Mac";
        GUIFactory factory;
        if (configOS.contains("win")) {
            factory = new WindowsFactory();
        } else if (configOS.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown OS");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
