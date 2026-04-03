package Arrays;

import java.util.Arrays;

public class Remove_duplicates2 {
    public static int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
}


