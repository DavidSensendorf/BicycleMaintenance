package Main.BikeClasses;

public class Tire {
    private String model;
    private int distance;
    private int age;
    private String size;
    private String type;
    private int sealantAge;
    private boolean isTubeless;

    public Tire() {
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSealantAge() {
        return sealantAge;
    }

    public void setSealantAge(int sealantAge) {
        this.sealantAge = sealantAge;
    }

    public boolean isTubeless() {
        return isTubeless;
    }

    public void setTubeless(boolean tubeless) {
        isTubeless = tubeless;
    }
}
