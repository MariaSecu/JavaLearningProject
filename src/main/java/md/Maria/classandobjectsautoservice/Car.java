package md.Maria.classandobjectsautoservice;

public class Car {

    String model;
    int year;
    int gearCapacity;
    double price;
    String fuelType;


    public Car(String model, int year, int gearCapacity, double price) {
        this.model = model;
        this.year = year;
        this.gearCapacity = gearCapacity;
        this.price = price;
        System.out.println("In urma executiei acestui constructor cu 4 " +
                "parametri se creeaza un nou obiect despre care nu cunoastem fuel type");
    }

    public Car(String inputModel, String inputFuelType) {
        this.model = inputModel;
        this.fuelType = inputFuelType;
        System.out.println("In urma utilizarii acestui constructor am " +
                "creat un obiect car despre care nu se cunoaste year, gear capacity, price ");
    }


}
