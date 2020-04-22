package exercise;

import java.util.Random;

import static exercise.Constance.numOfLettersAndNumbers;
import static exercise.Constance.sizeOfString;

public class RandomString {
    public static String generateRandomString() {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        String randomString = "";
        Random rand = new Random();
        char[] letterArray = alphaNumericString.toCharArray();
        for (int i = 0; i < sizeOfString; i++) {
            randomString += letterArray[rand.nextInt(numOfLettersAndNumbers)];
        }
        return randomString;
    }
}
