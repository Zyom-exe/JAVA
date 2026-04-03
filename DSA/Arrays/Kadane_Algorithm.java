package Arrays;

import java.util.Arrays;

public class Kadane_Algorithm {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=-1,end=-1, startf=-1;
        for (int i=0;i< nums.length;i++) {
            if(sum==0)
                start=i;
            if (sum < 0) {
                sum = 0;
            }

           sum += nums[i];
           if(sum>max) {
            max= sum;
            startf=start;
            end=i;
           }
        }
        System.out.println(startf+" "+end);

        for(int i=startf;i<=end;i++)
            System.out.print(nums[i]+" ");
        return max;
    }
        public static void main(String[] args) {
            int[] arr = {-2, -3, -7, -2, -10, -4};

            // Print the max subarray sum
            System.out.println("\nThe maximum subarray sum is: " + maxSubArray(arr));
        }
}
