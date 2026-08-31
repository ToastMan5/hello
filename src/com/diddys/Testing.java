package com.diddys;

import java.util.Arrays;
import java.util.Scanner;

//REMEMBER sout , soutv, itar. Quick ways to make a print statment and iteration

public class Testing {

    public static String getType(Object variable) {
        return variable == null ? "null" : variable.getClass().getSimpleName();
    }

    public static int sum(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }
// ^^ allows you to get the data type of a variable

    void main(String[] args) {

        System.out.println("HEY ITS TESTING");
        Scanner scanner = new Scanner(System.in); //create a new scanner

        int abeset = 1

        System.out.print("Enter your expression: ");
        //String expression = scanner.nextLine();
        String expression = "1+11*44+2";
        System.out.println(expression);

        /* how many of each symbol there are
        int count = 0;
        int multiplys = 0;
        int divides = 0;
        int adds = 0;
        int subtracts = 0;
        for (int i = 0; i < expression.length(); i++) { //from 0 to the length of the string
            switch (expression.charAt(i)) {
                case 'x', 'X', '*' -> multiplys++;
                case '/' -> divides++;
                case '+' -> adds++;
                case '-' -> subtracts++;
            }
        }
        System.out.println("Multiplys = " + multiplys + "\nDivides = " + divides + "\nAdds = " + adds + "\nSubtracts = " + subtracts);
        */

        int backNumLength = 0;
        int forwardNumLength = 0;
        for (int i = 0; i < expression.length(); i++) { //from 0 to the length of the string
            switch (expression.charAt(i)) {
                case 'x', 'X', '*': // if it finds a multiply operator:

                    for (int displacementBackward = i - 1; displacementBackward >= 0; displacementBackward--) { //iterate backwards to find beginning of the multiplication phrase
                        if (!Character.isDigit(expression.charAt(displacementBackward))) { //if character going back isn't a digit, then record the index and stop program
                            backNumLength = (i - displacementBackward) - 1; //hopefully length of the number before the multiplication symbol
                            break;
                        }
                        System.out.println("displacing backwards = " + expression.charAt(displacementBackward));
                    }
                    for (int displacementForward = i + 1; displacementForward < expression.length(); displacementForward++) { //iterate forwards to find end of the multiplication phrase
                        if (!Character.isDigit(expression.charAt(displacementForward))) { //if character going back isn't a digit, then record the index and stop program
                            forwardNumLength = (displacementForward - i) - 1; //hopefully length of the number after the multiplication symbol
                            break;
                        }
                        System.out.println("displacing forwards = " + expression.charAt(displacementForward));
                    }

            }
        }
        System.out.println("length of the number after the multiplication symbol = " + backNumLength + "\nlength of the number before the multiplication symbol = " + forwardNumLength);
        //System.out.println(count);
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

    }
}
