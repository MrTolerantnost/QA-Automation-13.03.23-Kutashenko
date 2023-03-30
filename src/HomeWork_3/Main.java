package HomeWork_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        int sum = 0;

        Random random = new Random();
        System.out.print("Array values are - ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print("All numbers are divisible by two are -  ");

        for (int q = 0; q < array.length; q++) {
            if (array[q] > 5 && array[q] < 45) {
                sum = sum + array[q];
            }
            if (array[q] % 2 == 0 && array[q]>0) {
                System.out.print(array[q] + " ");
            }

        }
        System.out.println();
        System.out.println("The sum of all elements of array in the bound 5<array[]<45 is - " + sum);

        }

    }

