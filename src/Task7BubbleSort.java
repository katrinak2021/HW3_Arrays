import java.util.Arrays;

public class Task7BubbleSort {
    public static void main(String[] args) {
        int n = 10;
        double[] arrayB = new double[n];

        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = (int) (Math.random() * 10);
        }

        System.out.println("Our initial array looks as follows:");
        System.out.println(Arrays.toString(arrayB));

        for (int i = arrayB.length-1; i>0; i--){
            for (int j = 0; j < i; j++){

                if (arrayB[j] > arrayB[j+1]){
                    double temp = arrayB[j];
                    arrayB[j] = arrayB[j+1];
                    arrayB[j+1] = temp;
                }
            }
        }

        System.out.println("The array after sorting:");
        System.out.println(Arrays.toString(arrayB));


    }
}
