package nl.novi.javaprogrammeren.two;

public class Animal {

    public void pet(int amountOfLegs, String name) {
        this.amountOfLegs = amountOfLegs;
        this.name = name;

    }

    private int amountOfLegs;
    private String name;

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
