package nyc.c4q.huilin;

import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by huilin on 9/2/16.
 */
public class Extra {

    static Scanner scanner = new Scanner(System.in);

    // Helper function that does the same thing as System.out.println
        public static void log(String input) {
            System.out.println(input);
        }

        public static boolean isNumber(String input) {
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {

                    // checking character by character 1234n
                    // the 0th 1st 2nd 3rd iteration will be true but not the 4th
                    // but i want it to evaluate to false and return false
                    //why don't i need to set equality operator to true/false in the if statement?
                    // will the the answer false not let that condition run?

                }
            }

        }





}
