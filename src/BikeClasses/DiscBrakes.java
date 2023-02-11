package BikeClasses;

public class DiscBrakes extends BrakingSystem{

    private String discModel;
    public DiscBrakes(String padType, int padAge, int padDistance, int distance, int age) {
        super(padType, padAge, padDistance, distance, age);
    }
}
