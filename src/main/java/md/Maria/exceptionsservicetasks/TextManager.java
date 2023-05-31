package md.Maria.exceptionsservicetasks;

public class TextManager {
    public static int getStringLength(String inputString) {
        return inputString.length();
    }

    public static int getStringLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has captured with the following message: " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed no mater what");
        }
    }

    public static int getLengthWithIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input String is null, be careful");
            return 0;
        } else
            return inputString.length();
    }
}
