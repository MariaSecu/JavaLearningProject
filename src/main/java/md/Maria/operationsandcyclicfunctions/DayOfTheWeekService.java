package md.Maria.operationsandcyclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "Duminica";

        System.out.println(dayName.toUpperCase());

        switch (dayName) {
            case "Luni":
                dayNumber = 1;
                break;
            case "Marti":
                dayNumber = 2;
                break;
            case "Miercuri":
                dayNumber = 3;
                break;
            case "Joi":
                dayNumber = 4;
                break;
            case "Vineri":
                dayNumber = 5;
                break;
            case "Sambata":
                dayNumber = 6;
                break;
            case "Duminica":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
                System.out.println("This day is not defined: ");
        }
        System.out.println("Number of the day " + dayName + " is " + dayNumber);
    }
}
