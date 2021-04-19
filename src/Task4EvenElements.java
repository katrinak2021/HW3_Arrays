import java.util.Arrays;
import java.util.Scanner;

public class Task4EvenElements {
    public static void main(String[] args) {
        Scanner arrayNum = new Scanner(System.in);
        System.out.println("Please enter array length in range between 6 and 10 (including)");

        int arrayLgt = arrayNum.nextInt();

        if (arrayLgt < 6 || arrayLgt > 10) {
            System.out.println("Please enter the number in the mentioned range");
        } else {
            double[] array5 = new double[arrayLgt];
            for (int i = 0; i < array5.length; i++) {
                array5[i] = (int) (Math.random() * 10);
            }
            System.out.println("Our initial array looks as follows:");
            System.out.println(Arrays.toString(array5));

            System.out.println("Even elements are following:");

            int[] oddArray = new int [arrayLgt];
            int [] evenArray = new int[arrayLgt];

            int odd = 0;
            int even = 0;
            int index = 0;

            while (index != arrayLgt){
                if (array5[index] %2 == 0){
                    evenArray[even++] = (int) array5[index];
                } else {
                    oddArray[odd++] = (int) array5[index];
                }
                index++;
            }

            evenArray = Arrays.copyOf(evenArray, even);
            System.out.println(Arrays.toString(evenArray));


        }


    }

}



