import java.util.Arrays;

public class Task6NamesSort {
    public static void main(String[] args) {
        String[] arrayNames = {"Harry", "Ronald", "Hermione", "Severus", "Tom", "Albus", "Dobby"};
        System.out.println("The unsorted array looks as follows:");
        System.out.println(Arrays.toString(arrayNames));

        System.out.println("The sorted array looks as follows:");
        Arrays.sort(arrayNames);
        System.out.println(Arrays.toString(arrayNames));
    }
}
