public class ControlFlow {
    public static void main(String[] args) {
        int x = 7;

        // if / else if / else
        if (x < 0) {
            System.out.println("x is negative");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is positive");
        }

        // for loop
        System.out.println("Counting 1..5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop
        int n = 3;
        while (n > 0) {
            System.out.println("n = " + n);
            n--;
        }

        // switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Another day");
        }
    }
}
