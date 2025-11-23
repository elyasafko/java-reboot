import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        // Create a Map from String to Integer
        Map<String, Integer> ages = new HashMap<>();

        // put(key, value) – insert or update
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 22);

        // Overwrite existing value
        ages.put("Bob", 31);  // Bob had a birthday 🙂

        // size()
        System.out.println("Size: " + ages.size());

        // get(key)
        System.out.println("Alice is " + ages.get("Alice") + " years old");

        // containsKey / containsValue
        if (ages.containsKey("Bob")) {
            System.out.println("Bob is in the map");
        }

        // Iterate over keys
        System.out.println("\nIterate over keys:");
        for (String name : ages.keySet()) {
            System.out.println(name + " -> " + ages.get(name));
        }

        // Iterate over entries (key + value)
        System.out.println("\nIterate over entries:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + " -> " + age);
        }

        // Find the person with the maximum age
        String oldestName = null;
        int maxAge = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            if (entry.getValue() > maxAge) {
                maxAge = entry.getValue();
                oldestName = entry.getKey();
            }
        }

        System.out.println("\nOldest person: " + oldestName + " (" + maxAge + ")");
    }
}
