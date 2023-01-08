package builder.pseudocode;

public class GPS {
    private String route;

    public GPS() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPS(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}