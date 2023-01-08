package builder.pseudocode;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setGPS(new GPS());
    }
}
