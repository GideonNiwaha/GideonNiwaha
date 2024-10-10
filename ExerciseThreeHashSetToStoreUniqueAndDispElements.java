import java.util.HashSet;

public class HashSetToStoreAndDisp {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Man");
        set.add("Girl");
        set.add("Man"); // Duplicate

        System.out.println("HashSet: " + set); // Only unique elements will be displayed
    }
}