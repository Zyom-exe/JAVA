package Arrays;
import java.util.*;
public class Majority_element {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int freq=0;
            if(mp.containsKey(nums[i])){
                freq=mp.get(nums[i]);
            }
            freq++;
            mp.put(nums[i],freq);
        }
        for(Map.Entry<Integer,Integer> map : mp.entrySet()){
            if(map.getValue()> nums.length/2)
                return map.getKey();
        }
        return -1;
    }
}
