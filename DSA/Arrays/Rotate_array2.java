package Arrays;
import java.util.*;
public class Rotate_array2 {
    public void rotate(int[] nums, int k) {
        reverse(nums,0, nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }

    static void reverse(int [] nums, int low, int high){
        while(low<high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Rotate_array obj=new Rotate_array();
        int[]a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        obj.rotate2(a,3);
        System.out.println(Arrays.toString(a));
    }
}
