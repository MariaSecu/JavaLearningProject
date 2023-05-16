package md.Maria.accessmodifiers.peopleevidence;

public class Person {

    public String firstName;
    String lastName;
    long idNumber;
    private int age;
    protected String adress;
    public boolean isRetaired;
    public static String nationality;
    public final boolean ISBREATHE = true;


    public Person(String firstName, String lastName, long idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        System.out.println("This person is created by a constructer with 3 parameters");
    }

    public Person(String firstName, String lastName, long idNumber,
                  int age, String adress, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.age = age;
        this.adress = adress;
        this.nationality = nationality;
        System.out.println("This object is created by a constructer with 6 parameters");
    }
}
