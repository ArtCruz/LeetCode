/**
 * ClimbingStairs_70
 */

public class ClimbingStairs_70 {

    public static void main(String[] args) {
        climbStairs(35);
    }

    public static int climbStairs(int n) {

        if (n <= 2) { //Sequencia de Fibonacci e Não Permutação
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        System.out.println(dp[n]);

        return dp[n];
    }

    //     int contagem = 0;

    //     if (n >= 1) {
    //         if (n % 2 == 0) {
    //             int duplo = n / 2;

    //             while (duplo != 0) {
    //                 if (duplo == n / 2) {

    //                     contagem++;
    //                     duplo--;

    //                 } else {

    //                     int duploVdd = duplo * 2;
    //                     int qtdRest = n - duploVdd;
    //                     int dividendo = duplo + qtdRest;

    //                     long resultado = calcularFactorial(dividendo)
    //                             / (calcularFactorial(duplo) * calcularFactorial(qtdRest));

    //                     contagem += resultado;
    //                     duplo--;
    //                 }

    //             }
    //             contagem++;
    //         } else {
    //             int duplo = n / 2;

    //             while (duplo != 0) {

    //                 int duploVdd = duplo * 2;
    //                 int qtdRest = n - duploVdd;
    //                 int dividendo = duplo + qtdRest;

    //                 long resultado = calcularFactorial(dividendo)
    //                         / (calcularFactorial(duplo) * calcularFactorial(qtdRest));

    //                 contagem += resultado;
    //                 duplo--;
    //             }
    //             contagem++;
    //         }

    //         System.out.println(contagem);

    //     }

    //     return contagem;
    // }

    // public static long calcularFactorial(int n) {

    //     long resultado = 1;

    //     for (long i = 2; i <= n; i++) {
    //         resultado *= i;
    //     }

    //     return resultado;
    // }
}