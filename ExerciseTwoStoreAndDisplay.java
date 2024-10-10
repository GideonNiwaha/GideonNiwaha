import java.util.ArrayList;

public class ExerciseTwoStoreAndDisplay {
    public static void main(String[] args) {
       // creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        //Adding elements
        numbers.add(11);
        numbers.add(23);
        numbers.add(35);
       // display elements
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}