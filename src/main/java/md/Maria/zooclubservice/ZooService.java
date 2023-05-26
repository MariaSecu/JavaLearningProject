package md.Maria.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Dog DoghiDog = new Dog("Doghi");
        Animal EmaCat = new Cat("Ema");
        Animal JeryMouse = new Mouse("Jery");
        Animal GaroldDog = new Dog("Garold");
        DoghiDog.eat();
        DoghiDog.makeSound();
        EmaCat.eat();
        EmaCat.makeSound();
        GaroldDog.makeSound();
        GaroldDog.eat();
        JeryMouse.eat();
        JeryMouse.makeSound();
    }
}
