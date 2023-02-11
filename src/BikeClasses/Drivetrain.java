package BikeClasses;

import java.util.ArrayList;
import java.util.List;

public class Drivetrain {
    private String model;
    private int year;
    private int age;
    private ArrayList<Chain> chains;
    private Cassette cassette;
    private Chainring chainring;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public List<Chain> getChains() {
        return chains;
    }

    public Cassette getCassette() {
        return cassette;
    }

    public Chainring getChainring() {
        return chainring;
    }

    public Drivetrain(String model, int year, int age, ArrayList<Chain> chains, Cassette cassette, Chainring chainring) {
        this.model = model;
        this.year = year;
        this.age = age;
        this.chains = chains;
        this.cassette = cassette;
        this.chainring = chainring;
    }
}
