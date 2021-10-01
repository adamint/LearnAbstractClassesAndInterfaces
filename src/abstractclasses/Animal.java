package abstractclasses;

public abstract class Animal {
    private String name;
    private int numberOfLegs;

    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public abstract String makeSound();

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "abstractclasses.Animal name is " + name + ", number of legs: " + numberOfLegs;
    }
}
