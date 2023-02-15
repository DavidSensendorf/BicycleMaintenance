package Main.BikeClasses;

import java.util.ArrayList;
import java.util.List;

public class Drivetrain {
    private String model;
    private int year;
    private int age;
    private ArrayList<Chain> chains;
    private Cassette cassette;
    private Chainring chainring;

    public Drivetrain() {
    }

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

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChains(ArrayList<Chain> chains) {
        this.chains = chains;
    }

    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

    public void setChainring(Chainring chainring) {
        this.chainring = chainring;
    }


}
