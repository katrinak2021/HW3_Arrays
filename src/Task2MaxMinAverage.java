import java.util.Arrays;
import java.util.Scanner;

public class Task2MaxMinAverage {
    public static void main(String[] args) {
        Scanner arNum = new Scanner(System.in);
        System.out.println("Please enter array lenght");
        int arLgt = arNum.nextInt();

        double[] array3 = new double[arLgt];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 10);
        }

        System.out.println("Our initial array looks as follows:");
        System.out.println(Arrays.toString(array3));

        int min = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < array3.length; i++) {
            sum += array3[i];
            if (min > array3[i]) {
                min = (int) array3[i];
            }
            if (max < array3[i]) {
                max = (int) array3[i];
            }
        }

        double average = (double) sum / array3.length;

   /*     System.out.printf("%n    min:  " + min);
        System.out.printf("%n    max:  " + max);
        System.out.printf("%naverage:  %.1f", average);
        System.out.println(" ");
*/
        System.out.println("Minimal value = " + min);
        System.out.println("Maximal value = " + max);
        System.out.println("Average value = " + average);

//два варианта, как записывать - system.out.printf
    }
}
