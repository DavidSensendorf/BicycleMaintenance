package Main.BikeClasses;

public class Chain {
    private int distance;
    private int age;
    private String model;
    private int speeds;
    private String lubeType;
    private int lubeInterval;

    public Chain() {

    }

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

    public String getLubeType() {
        return lubeType;
    }

    public void setLubeType(String lubeType) {
        this.lubeType = lubeType;
    }

    public int getLubeInterval() {
        return lubeInterval;
    }

    public void setLubeInterval(int lubeInterval) {
        this.lubeInterval = lubeInterval;
    }
}
