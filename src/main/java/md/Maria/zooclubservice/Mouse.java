package md.Maria.zooclubservice;

public class Mouse extends Animal implements AnimalInterface {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Mouse " + getName() + " eat cereales");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says chit-chit");
    }
}
