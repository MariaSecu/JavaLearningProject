package md.Maria.exceptionsservicetasks;

public class ArithmeticOperationService {
    public static int divedeIntNoExceptionHandLing(int s, int m) {
        return s / m;
    }

    public static int divedeIntWithExceptionHandLing(int s, int m) {
        try {
            int result = s / m;
            return result;
        } catch (ArithmeticException objectException) {
            System.out.println("An exception has occurred: " + objectException.getMessage());
            return 0;
        }
    }

}
