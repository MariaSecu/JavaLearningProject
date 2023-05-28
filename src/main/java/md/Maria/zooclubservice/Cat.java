package md.Maria.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating poorina One");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " says miau-miau");
    }
}
