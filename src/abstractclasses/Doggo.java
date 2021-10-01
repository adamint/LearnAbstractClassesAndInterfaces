package abstractclasses;

public class Doggo extends Animal {
    public Doggo(String name) {
        super(name, 4);
    }

    @Override
    public String makeSound() {
        return "Bark!";
    }
}
