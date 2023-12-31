
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));//3
        System.out.println(romanToInt("LVIII"));//58
        System.out.println(romanToInt("MCMXCIV"));//1994
    }

    public static int romanToInt(String s) {
        int ResultadoFinal = 0;

        Map<String,Integer> map = new HashMap<>();

        map.put("I" , 1);
        map.put("V" , 5);
        map.put("X" , 10);
        map.put("L" , 50);
        map.put("C" , 100);
        map.put("D" , 500);
        map.put("M" , 1000);


        for(int i = 0; i < s.length() ; i++){
            int valor = 0;
            if( i+1 < s.length() && map.get(String.valueOf(s.charAt(i))) < map.get(String.valueOf(s.charAt(i+1))) ){
                valor = map.get(String.valueOf(s.charAt(i+1))) - map.get(String.valueOf(s.charAt(i)));
                ResultadoFinal += valor;
                i++;
            }
            else{
                ResultadoFinal += map.get(String.valueOf(s.charAt(i)));
            }
        }
        return ResultadoFinal;
    }

}
