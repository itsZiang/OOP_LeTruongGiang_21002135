package factorymethod.pseudocode;

public class Application {
    private static Dialog dialog;

    public static void initialize(String osType) throws Exception {
        if (osType.equals("Windows")) {
            dialog = new WindowDialog();
        } else if (osType.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown OS");
        }
    }

    public static void main(String[] args) {
        try {
            initialize("Windows");
            dialog.render();
            System.out.println("================");
            initialize("Web");
            dialog.render();
            System.out.println("================");
            initialize("MacOS");
            dialog.render();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
