package ArraysInJava;

import java.util.Arrays;

public class ArraysInJava {

    // Initialize int arrays
    int[] numberSeries; // declared integer array
    int[] classRoll = new int[4]; // declared and initialized integer array with 0 as value
    int[] schoolIDs = { 0, 2, 15, 44, 12, 8, 66 }; // declared and initialized integer array with specific integers

    // Initialize String array
    String[] names; // declared
    String[] videoGames = new String[4]; // declared and init with empty strings
    String[] myFavFruits = { "bananas", "grapes", "apples", "kiwis" }; // declared and init with specifc strings

    public static void main(String[] args) {

        ArraysInJava aij = new ArraysInJava();
        aij.printIntegers();
        aij.printStrings();
        aij.customStringPrinter();
        aij.customIntPrinter();

    }

    private void customIntPrinter() {
        System.out.print("[");
        for (int i = 0; i < schoolIDs.length; i++) {
            System.out.print(schoolIDs[i]);
            if (i < schoolIDs.length) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    private void customStringPrinter() {
        System.out.print("{");
        int i = 0;
        for (String fruit : myFavFruits) {
            System.out.print(fruit);
            if (i < myFavFruits.length) {
                System.out.print(",");
            }
            i++;
        }
        System.out.print("}");
    }

    /**
     * printIntegers will print the value of the integer instance vars
     */
    private void printIntegers() {
        System.out.println("numberSeries:" + Arrays.toString(numberSeries));
        System.out.println("classRoll:" + Arrays.toString(classRoll));
        System.out.println("schoolIDs:" + Arrays.toString(schoolIDs));

        // Modify one integer index
        // numberSeries[0] = 23; //ava.lang.NullPointerException: Cannot store to int array because "this.numberSeries" is null
        numberSeries = new int[1];
        numberSeries[0] = 23;
        // Access one integer index
        System.out.println("numberSeries[0]: " + numberSeries[0]);

    }

    /**
     * printStrings will print the value of the String instance vars
     */
    private void printStrings() {
        System.out.println("names:" + names);
        System.out.println("videoGames:" + videoGames);
        System.out.println("myFavFruits:" + myFavFruits);

        // Modify one String index
        videoGames[2] = "Horizon";
        // Access one String index
        System.out.println("videoGames[2]:" + videoGames[2]);
    }

}
