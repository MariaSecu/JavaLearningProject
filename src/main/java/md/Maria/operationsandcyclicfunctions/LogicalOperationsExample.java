package md.Maria.operationsandcyclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean m = true;
        boolean s = false;
        boolean result = m && s;
        System.out.println("Logic and: " + result);
        // m=true
        m = result && s;
        // m = false
        System.out.println("Logic and: " + m);
        // result=false
        result = m || s;
        // result=false
        System.out.println("Logic or: " + result);

        System.out.println("Negation: " + !!!result);
    }
}
