public class ExerciseFiveGenericMethodToCreateMethod {
    // Generic method to print elements of an array
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {11, 22, 30};
        // String array
        String[] stringArray = {"I love", "Gideon"};

        System.out.println("Integer Array:");
        printArray(intArray); // Call generic method with Integer array

        System.out.println("String Array:");
        printArray(stringArray); // Call generic method with String array
    }
}