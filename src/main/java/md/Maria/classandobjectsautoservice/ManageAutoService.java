package md.Maria.classandobjectsautoservice;

public class ManageAutoService {
    public static void main(String[] args) {
        //Declararea si initializarea obiectelor folosind toate tipurile de constructori

        //Cream primul obiect de tip masina
        Car miniCooperMaria = new Car("miniCooper", 2020, 2, 20000.500);
        miniCooperMaria.fuelType = "diesel";
        //Afisam caracteristicile obiectului masina
        System.out.println("Masina de model: " + miniCooperMaria.model + ", din anul " + miniCooperMaria.year
                + ", cu capacitatea motorului de " + miniCooperMaria.gearCapacity + ", functioneaza cu combustibil " +
                miniCooperMaria.fuelType + " si are un pret de " + miniCooperMaria.price);
        Car mercedesMaria = new Car("mercedes", "diesel");
        System.out.println(mercedesMaria.model + ", aceasta masina functioneaza cu " + mercedesMaria.fuelType);
        //Cream primul obiect de tip garage
        Garage excelGarage = new Garage();
        excelGarage.number = 0;
        //Afisam primul obiect de tip garage
        System.out.println(excelGarage.carCapacity);
        //Cream cel de al 2 lea obiect de tip garage
        Garage excelGarage1 = new Garage("Banulescu Bodoni", true, 53, 40);
        //Afisam caracteristicile obiectului garage
        System.out.println(" Garajul Excel se afla la adresa " + excelGarage1.adress + " numarul " +
                excelGarage1.number + ", dispune de calculator " + excelGarage1.calculator +
                " ,acest garaj are capacitatea de " + excelGarage1.carCapacity + " de masini.");

        //Cream un obiect de tip tool
        Tool hammertool = new Tool("hammer", false);
        // Atribuim toate caracteristicile obiectului hammertool
        hammertool.isUsed = true;
        hammertool.uniqueNumber = 342;
        //Afisam in consola caracteristicile obiectului.
        System.out.println("Instrumentul " + hammertool.name + ", cu necesitatea electricitatii " +
                hammertool.needElectricity + ", este utilizat" + hammertool.isUsed +
                ", si poate si gasit sub numarul unic " + hammertool.uniqueNumber);

        //Cream un obiect din cadrul clasei store
        Store oil543 = new Store("oil", 97, 6548);
        oil543.isDisponible = true;
        //Afisam caracteristicile obiectului creat
        System.out.println("Produsul " + oil543.productName + ", are un pret de " + oil543.productPrice +
                " lei, poate fi gasit sub numarul unic " + oil543.idNumber + ", acesta este disponibil "
                + oil543.isDisponible);

        //Cu ajutorul unui default constructor vom crea un obiect al clasei workers
        Workers Ilarion = new Workers();
        Ilarion.name = "Ilarion";
        Ilarion.sexType = "masculin";
        Ilarion.specialization = "electrician";
        Ilarion.age = 35;
        Ilarion.salary = 15700;

        //Afisam caracyteristicile obiectului de tip workers
        System.out.println("Angajatul " + Ilarion.name + ", care are varsta de " + Ilarion.age +
                ", este de sex " + Ilarion.sexType + " acesta are specializarea de "
                + Ilarion.specialization + ", iar acesta primeste un salariu de "
                + Ilarion.salary + " lei.");


    }
}
