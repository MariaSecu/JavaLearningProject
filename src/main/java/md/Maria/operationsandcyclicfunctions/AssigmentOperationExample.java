package md.Maria.operationsandcyclicfunctions;

public class AssigmentOperationExample {
    public static void main(String[] args) {
        int m = 5;
        int s = 7;
        //Simple assigment
        int result = m;
        System.out.println("Simple assigment: " + result);
        //Assigment with assembly
        result += s;
        System.out.println("Assigment with assembly: " + result);
        // Assigment with decrease
        result -= m;
        System.out.println("Assigment with decrease: " + result);
        //Assigment with multiplication
        result *= m;
        System.out.println("Assigment with multiplication: " + result);
        // Assigment with devision
        result /= m;
        System.out.println("Assigment with devision: " + result);
        //Assigment with rest of devision
        result %= s;
        System.out.println("Assigment with rest of devision: " + result);


    }
}
