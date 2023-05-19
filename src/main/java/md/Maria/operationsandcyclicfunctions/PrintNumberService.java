package md.Maria.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int m = 500;
        int limit = 500;
        while (m > 0) {
            System.out.print(m + ", ");
            m = m - 1;
            m -= 1;
            m--;
        }
        System.out.println();
        //The result after while is o

        do {
            System.out.print(m + ", ");
            m = m + 1;
            m++;
        } while (m < limit);
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("[], ");
            }
        }
        System.out.println();
    }
}
