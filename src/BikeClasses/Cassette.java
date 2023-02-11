package BikeClasses;

public class Cassette {
    private int distance;
    private int age;
    private int speeds;
    private String model;
    private String size;

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

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cassette(int distance, int age, int speeds, String model, String size) {
        this.distance = distance;
        this.age = age;
        this.speeds = speeds;
        this.model = model;
        this.size = size;
    }
}
