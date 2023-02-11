package BikeClasses;

public class Wheel {
    private String model;
    private int distance;
    private int age;
    private String size;
    private String material;
    private Tire tire;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Wheel(String model, int distance, int age, String size, String material, Tire tire) {
        this.model = model;
        this.distance = distance;
        this.age = age;
        this.size = size;
        this.material = material;
        this.tire = tire;
    }
}
