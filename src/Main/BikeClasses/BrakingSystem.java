package Main.BikeClasses;

public abstract class BrakingSystem {
    private BrakePad brakePad;
    private int distance;
    private int age;


    public BrakePad getBrakePad() {
        return brakePad;
    }

    public void setBrakePad(BrakePad brakePad) {
        this.brakePad = brakePad;
    }

    public int getDistance() {
        return distance;
    }

    public int getAge() {
        return age;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BrakingSystem() {

    }
}
