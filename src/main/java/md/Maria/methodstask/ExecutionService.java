package md.Maria.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(20, 30);
        System.out.println("Variable randomInt: " + randomInt);
        int randomInt1 = DataGeneratorUtil.getRandomInt(25);
        System.out.println("Variable randomInt: " + randomInt1);
        double randomDouble = DataGeneratorUtil.getRandomDouble(70);
        System.out.println("Variable randomDouble: " + randomDouble);
        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-100);
        System.out.println("Variable randomDouble: " + randomDouble1);
        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());
        System.out.println("\nRandom Email Address 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email Address 2: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Valid String of X chars: " + DataGeneratorUtil.generateValidRandomString(25));
        System.out.println("Random Valid String of X chars: " + DataGeneratorUtil.generateValidRandomString(20));
        System.out.println("Random Invalid String of X chars: " + DataGeneratorUtil.generateInvalidRandomString(-5));
        Customer mariaCustomer = new Customer("Maria Marian" + 378998789L + 20 + "maria.maria@gmail.com", DataGeneratorUtil.getRandomInt(90), DataGeneratorUtil.getRandomEmail());
        System.out.println("The name of the object is: " + mariaCustomer.getName());
        System.out.println("mariaCustomer object has the id: " + mariaCustomer.getId());
        System.out.println("The age is: " + mariaCustomer.getAge());
        System.out.println("with the email adress: " + mariaCustomer.getEmailAdress());
        mariaCustomer.setName("Maria Secu");
        mariaCustomer.setId(567446778);
        mariaCustomer.setAge(22);
        mariaCustomer.setEmailAdress("amigoMaria@gmai.com");
        System.out.println("The name of the object is: " + mariaCustomer.getName());
        System.out.println("mariaCustomer object has the id: " + mariaCustomer.getId());
        System.out.println("The age is: " + mariaCustomer.getAge());
        System.out.println("with the email adress: " + mariaCustomer.getEmailAdress());
        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(30), DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.getAge());
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(12));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 84));
        randomDataCustomer.setEmailAdress(DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());


    }
}
