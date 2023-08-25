public class PlusOne_66 {

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        plusOne(array1);
        int[] array2 = { 4, 3, 2, 1 };
        plusOne(array2);
        int[] array3 = { 9 };
        plusOne(array3);

    }

    public static int[] plusOne(int[] digits) {

        int tam = digits.length;
        int numElev = tam - 1;
        int soma = 0;

        for (int i = 0; i < digits.length; i++) {
            soma += digits[i] * (int) Math.pow(10, numElev);
            numElev--;
        }

        soma++;

        String numeroString = Integer.toString(soma);

        int quantidadeDigitos = numeroString.length();

        if (tam < quantidadeDigitos) {
            int[] novoArray = new int[tam + 1];
            for (int i = 0; i < quantidadeDigitos; i++) {
                novoArray[i] =  Character.getNumericValue(numeroString.charAt(i));
            }

            for (int i = 0; i < quantidadeDigitos; i++) {
                System.out.println(novoArray[i]);
            }

            return novoArray;
        } else {
            for (int i = 0; i < quantidadeDigitos; i++) {
                digits[i] = Character.getNumericValue(numeroString.charAt(i));
            }

            for (int i = 0; i < quantidadeDigitos; i++) {
                System.out.println(digits[i]);
            }

            return digits;
        }
    }

}
