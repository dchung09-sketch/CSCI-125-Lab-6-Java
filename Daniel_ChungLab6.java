/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 6 Problems 1-5
 */
//Hi Professor, in this lab, I was able to successfully write all of my code correctly as I ran some outputs and it was working, but then all of a sudden there were public class main problems and I had a hard time solving this issue
public class Main {// This is the main class that wouild start all of the operations

    // Problem 1: Reverse String
    public static String reverse(String str) {// // This string method is starting the operation of performing a reversed operation within the code
        StringBuilder builder = new StringBuilder(str);// This takes the string of an input and outputs the reversed strong of that input
        return builder.reverse().toString();// This code would convert the reversed responses and turns it back into a strong before returning it.
    }// This is the ending of the curly bracket

    // Problem 2: Reverse Digits of an Integer
    public static int thewordsswitched(int d) {// This code takes in the integer as an object and return it as an integer
        int product = 0;// This takes an integer and places it at a value of Zero
        while (d != 0) {// This is a while loop that wpould generate many integeres, until the integers turn Zero
            int leftovers = d % 10;// This code takes the last leftover number and nstores it's unit into a variable
            product = 10 * product + leftovers;// This multiplies the product into a singular space and then adds the last digits being reversed
            d = d / 10;// Removing the last digit by dividing by 10, and puts the result back into d
        }// End of curly bracket code
        return product;// This ends the method and returns the value of product
    }// End of curly bracket code

    // Problem 3: Fibonacci Example
    public static int fibonaccinumberexample(int daniel) {// This code would be able to identify methods that would be able to calculate a fibonacci number
        int d = 0, c = 1, product = 0;// The line is declaring three integer labels

        if (daniel == 1) return c;// If daniel is equal to 1, return the value to C
        if (daniel == 0) return d;// If daniel is equal to 0, return the value to d
        for (int i = 2; i <= daniel; i++) {// The loop continous until the value I goes past the values of the varaible, further continouing the sequence
            product = c + d;// The product is equal to both c + d
            d = c;// The variable d would b equal to variable c
            c = product;// The variable holder c is equal towards the varaible product
        }
        return product;// This ends the method and returns the value of product
    }

    // Problem 4: Digital Root (Summing digits until single digit)
    public static int numericalnumers(int chung) {// This method takes the integer values and repeats the summing until its a single digit
        while (chung >= 10) {// This is a while statement, if the variable is greater than or equal to 10
            int thecurrentsum = 0;// The current integer leel is set to 0
            while (chung > 0) {// This is a while statement, indicating if the variable is greater than 0,
                thecurrentsum += chung % 10;// This adds the value of the variable chung to the ariable thecurrentsum
                chung /= 10;// This code removed the last digit of the variable and divides it by 10
            }// Thi is an ending curly bracket code
            chung = thecurrentsum;// The two overall variables would become equal towards each other
        }// This is the ending of a curly bracket entry
        return chung;// This ends the method and returns the value of the variable chung
    }// This is the ending of a curl bracket entry

    // Problem 5: Check Substring
    public static boolean isSubstring(String mainStr, String subStr) {// This code defines as a method to identify if a string is visible within another string
        return mainStr.contains(subStr);// If mainstr has substr, the statement would b trunue otherwise it is false
    }// This is the ending of the curly bracket code

    // Main method Answers
    public static void Main(String[] args) {// This code starts the arguments for strings
        // Problem 1: Reverse a string
        String testString = "Dogs!";// This is the testing string which will be reversed
        System.out.println("The current information provided: " + testString + " and the phrase reversed is: " + reverse(testString));// The output would be in green along with the variable
        System.out.println();// This line of code also helps produce the output for organization sake

        // Problem 2: Reverse digits of an integer
        int labexample1 = 1904;// The integer value of the variable is being set at 1904
        System.out.println("The reversed integer product of result " + labexample1 + " is equal to " + thewordsswitched(labexample1));// The output would be in green along with the variable
        System.out.println();// This line of code also helps produce the output for organization sake

        // Problem 3: Fibonacci number at a specific position
        int daniel1 = 10;// The integer value of this variable is being set to 10
        System.out.println("Fibonacci number at position 10: " + fibonaccinumberexample(daniel1));//The output would be in green along with the variable
        System.out.println();// This line of code also helps produce the output for organization sake

        // Problem 4: Digital root of a number
        int d1 = 9875;// The integer value is being set at a specific position at 9875
        System.out.println("The amount figure for the number 9875 is " + numericalnumers(d1));//The output would be in green along with the variable
        System.out.println();// This line of code also helps produce the output for organization sake

        // Problem 5: Check if a string is a substring of another string
        String mainStr = "hello";// The specifc string is being set to mainStr
        String subStr = "ell";// This specific string is being set to subStr
        System.out.println("Is it true that '" + subStr + "' is a substring of '" + mainStr + "'? " + isSubstring(mainStr, subStr));//The output would be in green along with the variable
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created
