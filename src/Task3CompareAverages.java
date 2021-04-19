import java.util.Arrays;

public class Task3CompareAverages {
    public static void main(String[] args) {
        int n = 5;

        double[] array1 = new double[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println("First array: ");
        System.out.println(Arrays.toString(array1));

        double [] array2 = new double[n];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }
        System.out.println("Second array: ");
        System.out.println(Arrays.toString(array2));

        double sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        double average1 = sum / array1.length;

        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        double average2 = sum / array2.length;

        System.out.println("Average of the first array = " + average1);
        System.out.println("Average of the second array = " + average2);

        if (average1 > average2){
            System.out.println("Average of the first array is bigger");
        } else if (average1 < average2){
            System.out.println("Average of the second array is bigger");
        }
        else {
            System.out.println("Averages of the arrays are equal");
        }


    }
}
