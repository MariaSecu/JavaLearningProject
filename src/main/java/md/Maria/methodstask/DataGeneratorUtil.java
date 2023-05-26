package md.Maria.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    // Create new random object
    private static Random random = new Random();
    //Define a method to get random int
    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("The minimal value has to be smaller than the maximal one");
            return 0;
        }
        int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + min;
        return randomNumber;
    }

    //Overloading the getRandomInt method
    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    //Create a method to generate a random double
    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("The limit has to be positive");
            return 0;
        }
        return random.nextDouble() * limit;
    }

    //Create a method to generate a random boolean
    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    //Create a method to generate a random email
    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@gmail.com";
        return uuid + domain;
    }

    //Create a random String by using a method
    public static String generateValidRandomString(int length) {
        String acceptedChars = "ACDEFGHIabcdefgi01234";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("Into the iteration: i = " + i + " the attached character is "
                    + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

    //Generate random invalid adress for the negative cases
    public static String generateInvalidRandomString(int length) {
        String acceptedChars = "*&^%$#!@";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("Into the iteration: i = " + i + " the attached character is "
                    + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}
