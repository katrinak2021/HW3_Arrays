import java.util.Arrays;
import java.util.Scanner;

public class Task1DeletingNumber {
    public static void main(String[] args) {
        int n = 10;
        double[] array2 = new double[n];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        System.out.println("Our initial array looks as follows:");
        System.out.println(Arrays.toString(array2));

        Scanner userNum = new Scanner(System.in);
        System.out.println("Please enter the number. If it's in array, we will delete it");
        int a = userNum.nextInt();

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == a) {

                for (int j = i; j < array2.length - 1; j++) {
                    array2[j] = array2[j + 1];
                }
            }
        }

        System.out.println("The array without your entered number looks as follows:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }
    }
}












