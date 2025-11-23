import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result)); // [1, 3, 0]
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If we reach here, all digits were 9: 9, 99, 999...
        int[] extended = new int[n + 1];
        extended[0] = 1;
        return extended;
    }
}
