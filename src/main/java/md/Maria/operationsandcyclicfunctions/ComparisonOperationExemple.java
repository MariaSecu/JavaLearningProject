package md.Maria.operationsandcyclicfunctions;

public class ComparisonOperationExemple {
    public static void main(String[] args) {
        int m = 8;
        int s = 3;
        //Equal with
        boolean isEqual = m == s;
        System.out.println("The result of the comparison is " + isEqual);
        //Different from
        boolean isNotEqual = m != s;
        System.out.println("Different from: " + isNotEqual);
        //Greater than
        boolean isGreater = s > m;
        System.out.println("Greater s than m: " + isGreater);
        //Less than
        boolean isLessThan = s < m;
        System.out.println("S is less than m: " + isLessThan);
        //Greater or equal
        boolean isGreaterOrEqual = s >= m;
        System.out.println("The result is: " + isGreaterOrEqual);
        //Less or equal
        boolean isLessOrEqual = s <= m;
        System.out.println("The result is: " + isGreaterOrEqual);

    }
}
