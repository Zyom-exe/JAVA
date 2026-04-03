package Arrays;
import java.util.*;
public class Two_sum {
    public static int[] twoSum_1(int[] nums, int target) {
        Arrays.sort(nums);
        int l=0;
        int h= nums.length;
        int[] index=new int[2];
        while(l<h) {
            if(nums[l]+nums[h]<target) {
                l++;
            }
            else if(nums[l]+nums[h]>target){
                h--;
            }
            else {
                index[0] = l;
                index[1] = h;
                break;
            }
        }
        return index;
    }
    static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=Math.abs(target-nums[i]);
            if(mp.containsKey(comp)){
                return new int[]{mp.get(comp),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] ans= twoSum_1(nums,18);

        System.out.println(Arrays.toString(ans));
    }
}
