public class VariablesAndTypes {
    public static void main(String[] args) {
        // Primitive types
        int age = 25;
        double height = 1.78;
        boolean isStudent = true;
        char grade = 'A';

        // Reference type (String)
        String name = "Elyasaf";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is student? " + isStudent);
        System.out.println("Grade: " + grade);

        // Casting
        double pi = 3.14159;
        int approxPi = (int) pi;  // explicit cast
        System.out.println("Pi: " + pi + ", approx: " + approxPi);
    }
}
