public class RemoveElements_27 {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int valorParaRemover = 3;
        removeElement(nums, valorParaRemover);
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int valorParaRemover2 = 2;
        removeElement(nums2, valorParaRemover2);
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return index;
    }
}