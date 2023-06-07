package md.Maria.bookcollectiontask;

public class Execution {
    public static void main(String[] args) {
        int[] tableDate = {2, 5, 3, 8, 6, 78, 4, 1, 9};
        System.out.println(IntNumberArrayService.getTheMinimValueOfTheArray(tableDate));
        System.out.println(IntNumberArrayService.getTheMinimValueIndexOfTheArray(tableDate));
        System.out.println(IntNumberArrayService.CalculateAverageOfArray(tableDate));
    }


}
