
import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        String[] lista1 = new String[3];
        lista1[0] = "flower";
        lista1[1] = "flow";
        lista1[2] = "flight";
        System.out.println(longestCommonPrefix(lista1));

        String[] lista2 = new String[3];
        lista2[0] = "dog";
        lista2[1] = "racecar";
        lista2[2] = "car";
        System.out.println(longestCommonPrefix(lista2));
    }

    public static String longestCommonPrefix(String[] strs) {

        String ResultadoFinal = "";
        String strVolatil = "";

        for (int i = 0; i < strs.length; i++) {
            ResultadoFinal = "";
            for (int t = 0; t < strs[i].length(); t++) {
                if (i == 0) {
                    strVolatil = strs[i];
                } else {
                    if (t < strVolatil.length() && strs[i].charAt(t) == strVolatil.charAt(t)) {
                        ResultadoFinal += strs[i].charAt(t);
                    }
                }
            }
        }
        return ResultadoFinal;
    }
}
