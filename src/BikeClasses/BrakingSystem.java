package BikeClasses;

public abstract class BrakingSystem {
    private String padType;
    private int padAge;

    private int padDistance;

    private int distance;
    private int age;

    public String getPadType() {
        return padType;
    }

    public int getPadAge() {
        return padAge;
    }

    public int getPadDistance() {
        return padDistance;
    }

    public int getDistance() {
        return distance;
    }

    public int getAge() {
        return age;
    }

    public void setPadType(String padType) {
        this.padType = padType;
    }

    public void setPadAge(int padAge) {
        this.padAge = padAge;
    }

    public void setPadDistance(int padDistance) {
        this.padDistance = padDistance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BrakingSystem(String padType, int padAge, int padDistance, int distance, int age) {
        this.padType = padType;
        this.padAge = padAge;
        this.padDistance = padDistance;
        this.distance = distance;
        this.age = age;
    }
}
