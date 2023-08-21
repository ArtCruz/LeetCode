package org.example.Easy;

public class PalindromeNumber_2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String numero = Integer.toString(x);
        String listaOrdem = "";
        String listaContra = "";

        for (int i = 0; i < numero.length(); i++) {
            listaOrdem += numero.charAt(i);
        }
        for (int t = numero.length() - 1; t >= 0; t--) {
            listaContra += numero.charAt(t);
        }

        return listaOrdem.equals(listaContra);
    }
}
