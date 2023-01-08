package builder.pseudocode;

public class Application {
    public static void makeCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getProduct();
        car.getEngine().on();
        car.getTripComputer().showStatus();
        car.getEngine().go(10);
        car.getEngine().off();
        System.out.println(car.getGps().getRoute());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);

        Manual manual = carManualBuilder.getProduct();
        System.out.println(manual.print());
    }

    public static void main(String[] args) {
        makeCar();
    }
}
