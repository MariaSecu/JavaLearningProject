package md.Maria.operationsandcyclicfunctions;

public class IncrementDecrementExemple {
    public static void main(String[] args) {
        int a = 4;
        //Increment
        a++;
        System.out.println("The value after the incremet: " + a);
        //Preincrment
        ++a;
        int b = ++a;
        int a1 = a;
        int c = a++;
        System.out.println("The value after the preincremet: " + a);
        System.out.println("Display b=" + b + " a1=" + a1 + " c=" + c + " a2=" + a);
        //Decrement
        a--;
        System.out.println("The value after decrement: " + a);
        //Predecrement
        --a;
        System.out.println("The value after predecrement: " + a);
    }
}
