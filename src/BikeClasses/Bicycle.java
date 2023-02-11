package BikeClasses;

public class Bicycle {
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

    public Bicycle(String name, String type, String manufacturer, String model, int age, int distance,
                   BrakingSystem brakes, Drivetrain drivetrain, Wheel rearWheel, Wheel frontWheel, Cables cables) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.age = age;
        this.distance = distance;
        this.brakes = brakes;
        this.drivetrain = drivetrain;
        this.rearWheel = rearWheel;
        this.frontWheel = frontWheel;
        this.cables = cables;
    }
}