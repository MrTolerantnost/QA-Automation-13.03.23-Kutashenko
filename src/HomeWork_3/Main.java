package HomeWork_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20]; // Creates an array of length 20
        int sum = 0; // Initializes a variable to hold the sum of elements within the bound 5 < array[] < 45

        Random random = new Random(); // Creates a Random object to generate random numbers
        System.out.print("Array values are - ");

        // Loop through the array to generate random integers and print them
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print("All numbers divisible by two are -  ");

        // Loop through the array to check if each element is divisible by 2 and within the range 5 < array[] < 45
        // Also calculate the sum of elements within the bound 5 < array[] < 45
        for (int q = 0; q < array.length; q++) {
            if (array[q] > 5 && array[q] < 45) {
                sum = sum + array[q];
            }
            if (array[q] % 2 == 0 && array[q] > 0) {
                System.out.print(array[q] + " ");
            }

        }
        System.out.println();
        System.out.println("The sum of all elements of array in the bound 5 < array[] < 45 is - " + sum);

    }
}
