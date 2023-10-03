package ArraysInJava;

import java.util.Scanner;

public class Day7ArraysChallenge {
    int[] intArray = new int[4];
    int sizeOf;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Day7ArraysChallenge a = new Day7ArraysChallenge();
        a.getUserInput();
        a.printReverseArray();
    }

    /**
     * getUserInput gets the size of the array and the array
     */
    private void getUserInput() {
        sizeOf = Integer.parseInt(scanner.nextLine());
        String[] sArr = scanner.nextLine().split(" ");
        // Ignores the array elements outside of the entered size
        for (int i = 0; i < sizeOf; i++) {
            intArray[i] = Integer.parseInt(sArr[i]);
        }
    }

    /**
     * printReverseArray prints the integer array in reverse order
     */
    private void printReverseArray() {
        for (int i = sizeOf - 1; i >= 0; i--) {
            System.out.printf("%d ", intArray[i]);
        }
    }

}
