package md.Maria.classandobjectsautoservice;

public class Garage {
    String adress;

    boolean calculator;

    int number;

    int carCapacity;

    public Garage(String adress, boolean calculator, int number, int carCapacity) {
        this.adress = adress;
        this.calculator = calculator;
        this.number = number;
        this.carCapacity = carCapacity;
    }

    public Garage() {
        System.out.println("Garajul se afla la adresa: ");
    }
}
