import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Orange");
        list.add("Pineapple");
        list.add("Powpow");

        // Access elements
        System.out.println("First Element: " + list.get(0));

        // Remove element
        list.remove("Pineapple");

        // Display all elements
        System.out.println("ArrayList: " + list);
    }
}