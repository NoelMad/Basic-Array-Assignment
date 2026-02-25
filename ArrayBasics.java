import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // Part A: Integer Array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the array
        System.out.println("Array: " + Arrays.toString(numbers));

        // Print the length of the array
        System.out.println("Length: " + numbers.length);

        // Print each element on a separate line
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }

        // Change value at index 2 to 35
        numbers[2] = 35;

        // Print the array after modification
        System.out.println("Array after change: " + Arrays.toString(numbers));

        // Part B: String Array
        String[] languages = {"Java", "Python", "C++", "JavaScript"};

        // Print the array
        System.out.println("\nProgramming Languages: " + Arrays.toString(languages));

        // Find the longest language name
        String longest = languages[0];
        for (String lang : languages) {
            if (lang.length() > longest.length()) {
                longest = lang;
            }
        }
        System.out.println("Longest language name: " + longest);

        // Print all languages starting with 'J'
        System.out.println("Languages starting with 'J':");
        for (String lang : languages) {
            if (lang.charAt(0) == 'J') {
                System.out.println(lang);
            }
        }
    }
}