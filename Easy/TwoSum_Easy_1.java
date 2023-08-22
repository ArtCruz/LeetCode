
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Easy_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int valor = nums[i];

            int x = target - valor;
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(valor, i);
        }
        return null;
    }
}
