import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Add
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Size
        System.out.println("Size: " + names.size());

        // Index-based loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        // Enhanced for
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Contains / remove
        if (names.contains("Bob")) {
            System.out.println("Found Bob, removing...");
            names.remove("Bob");
        }

        System.out.println("After removal: " + names);
    }
}
