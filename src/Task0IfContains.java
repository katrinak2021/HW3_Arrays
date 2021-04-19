
import java.util.Arrays;
import java.util.Scanner;

public class Task0IfContains {
    public static void main(String[] args) {
        int n = 10;
        double[] array1 = new double[n];

        for(int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random()*10);
        }
//math random cannot be int

        System.out.println("Our initial array looks as follows:");
        System.out.println(Arrays.toString(array1));

       Scanner userNum = new Scanner(System.in);
        System.out.println("Please enter the number to check if it's in the array");

        int toFind = userNum.nextInt();
        boolean found = false;
        for (double z : array1){
            if (z == toFind){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println(toFind + " is found");
                }
        else {
            System.out.println(toFind + " is not found");
        }

    }

}
