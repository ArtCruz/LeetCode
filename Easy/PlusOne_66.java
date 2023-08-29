import java.util.Arrays;

public class PlusOne_66 {

    public static void main(String[] args) {
        // int[] array1 = { 1, 2, 3 };
        // plusOne(array1);
        // int[] array2 = { 4, 3, 2, 1 };
        // plusOne(array2);
        // int[] array3 = { 9 };
        // plusOne(array3);
        int[] array4 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        plusOne(array4);
    }

    public static int[] plusOne(int[] digits) {

        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Valor a ser mantido no dígito
            carry = sum / 10; // Valor a ser carregado para o próximo dígito
        }

        if (carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        } else {
            return digits;
        }

    }

}
