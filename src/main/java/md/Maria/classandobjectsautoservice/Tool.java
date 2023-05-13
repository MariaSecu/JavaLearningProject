package md.Maria.classandobjectsautoservice;

public class Tool {
    String name;
    boolean needElectricity;
    boolean isUsed;
    int uniqueNumber;

    public Tool(String caracteristicName, boolean needElectricity) {
        System.out.println(" --A product with thisthe features is in stock-- ");
        this.name = caracteristicName;
        this.needElectricity = needElectricity;

    }

    public Tool(int uniqueNumber, boolean isUsed) {
        this.uniqueNumber = uniqueNumber;
        this.isUsed = isUsed;

    }
}
