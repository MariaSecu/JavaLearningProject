package md.Maria.methodstask;

public class Customer {
    private String name;
    private long id;
    private String emailAdress;
    private int age;

    //Create a constructer with parameters
    public Customer(String name, int randomInt, String randomEmail) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.id = id;
        if ((age <= 1) || (age > 85)) {
            System.out.println("This age is invalid");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Create a methods that will get the parameters
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public int getAge() {
        return age;
    }

    //Create a methods that will set the parameters
    public void setName(String newName) {
        this.name = name;
    }

    public void setId(long newId) {
        this.id = id;
    }

    public void setEmailAdress(String newEmailAdress) {
        this.emailAdress = emailAdress;
    }

    //Define the limit for age
    public void setAge(int newAge) {
        if ((newAge <= 1) || (newAge > 85)) {
            System.out.println("this age is invalid");
        } else {
            this.age = newAge;
        }
    }
    @Override
    public String toString() {
        return "Customer: " + "name is " + name +
                " the id " + id + ", age is " + age +
                " and the Email adress is " + emailAdress;
    }
}
