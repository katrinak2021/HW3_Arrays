import java.util.Arrays;

public class Task5EvenIndexTo0 {
    public static void main(String[] args) {
        int n = 10;
        double[] array1 = new double[n];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        System.out.println("Our initial array looks as follows:");
        System.out.println(Arrays.toString(array1));

        for (int z = 0; z < array1.length; z++) {
            if (z%2 != 0){
                array1[z] = 0;
            }

        }

        System.out.println("Our second array with changed elements with odd indexes looks as follows:");
        System.out.println(Arrays.toString(array1));

    }
}
