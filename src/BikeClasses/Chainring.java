package BikeClasses;

public class Chainring {
    private int distance;
    private int age;
    private String size;
    private String model;
    private int speeds;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public Chainring(int distance, int age, String size, String model, int speeds) {
        this.distance = distance;
        this.age = age;
        this.size = size;
        this.model = model;
        this.speeds = speeds;
    }
}
