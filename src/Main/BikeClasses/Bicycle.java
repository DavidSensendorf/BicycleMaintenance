package Main.BikeClasses;

public class Bicycle {
    private int distanceInterval;
    private int ageInterval;
    private String name;
    private String type;
    private String manufacturer;
    private String model;
    private int age;
    private int distance;
    private BrakingSystem brakes;
    private Drivetrain drivetrain;
    private Wheel rearWheel;
    private Wheel frontWheel;

    private Cables cables;

    public Bicycle() {
    }

    public int getDistanceInterval() {
        return distanceInterval;
    }

    public void setDistanceInterval(int distanceInterval) {
        this.distanceInterval = distanceInterval;
    }

    public int getAgeInterval() {
        return ageInterval;
    }

    public void setAgeInterval(int ageInterval) {
        this.ageInterval = ageInterval;
    }

    public Cables getCables() {
        return cables;
    }

    public void setCables(Cables cables) {
        this.cables = cables;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public int getDistance() {
        return distance;
    }

    public BrakingSystem getBrakes() {
        return brakes;
    }

    public Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public Wheel getRearWheel() {
        return rearWheel;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setBrakes(BrakingSystem brakes) {
        this.brakes = brakes;
    }

    public void setDrivetrain(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    public void setRearWheel(Wheel rearWheel) {
        this.rearWheel = rearWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel;
    }

}