package md.Maria.classandobjectsautoservice;

public class Store {

    String productName;
    float productPrice;
    int idNumber;

    boolean isDisponible;


    public Store(String inputProductName, float inputProductPrice, int inputIdNumber) {
        System.out.println("a product with this features is in stock");
        this.productName = inputProductName;
        this.productPrice = inputProductPrice;
        this.idNumber = inputIdNumber;
    }
}
