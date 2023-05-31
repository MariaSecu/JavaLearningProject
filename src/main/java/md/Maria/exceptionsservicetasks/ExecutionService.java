package md.Maria.exceptionsservicetasks;

import java.io.IOException;

public class ExecutionService {
    public static void main(String[] args) {

        int result1 = ArithmeticOperationService.divedeIntNoExceptionHandLing(7, 0);
        System.out.println(result1);
        System.out.println("The program is running till the end ");

        String stringValue = "Maria";
        String stringValue2 = null;
        System.out.println(TextManager.getStringLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getLengthWithIfElse(stringValue2));
        System.out.println(TextManager.getStringLength(stringValue));

        String filePath = "src/main/java/md/Maria/exceptionsservicetasks/test.txt";
        try {
            ReadDataManager.readDataFileWhithoutTryAndCatch(filePath);
        } catch (IOException objectException) {
            System.out.println("The file not exist, the execution of the program is not interrupted");
        } finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");
        ReadDataManager.readDataFileWithTryAndCatch(filePath);
        System.out.println("The program is running");

    }
}
