import java.util.HashMap;

public class ExerciseFourHashMapToStoreKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Gideon", 22);
        map.put("Niwaha", 20);

        // Access value by key
        System.out.println("Alice's age: " + map.get("Gideon"));
    }
}