package md.Maria.operationsandcyclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 65;

        if (testResult >= 90) {
            System.out.println("Qualifying A");
        } else if (testResult >= 80) {
            System.out.println("Qualifying B ");
        } else if (testResult >= 70) {
            System.out.println("Qualifying C");
        } else if (testResult >= 60) {
            System.out.println("Qualifying D");
        } else {
            System.out.println("This qualify is not defined");
        }
        System.out.println("The program is finished.");
    }
}
