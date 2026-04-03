package Arrays;
import java.util.*;

public class Remove_duplicates {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int num : nums) {
            int freq = 0;
            if (mp.containsKey(num)) {
                freq = mp.get(num);
            }
            freq++;
            mp.put(num, freq);
        }
        List<Integer> ls=new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
               ls.add(it.getKey());
        }
        for(int i=0;i<ls.toArray().length;i++) {
            nums[i] = ls.get(i);
        }
        System.out.println(ls);
        System.out.println(Arrays.toString(nums));
        return ls.size();
    }

    public static void main(String[] args) {
        int[] a={-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(a));
    }
}
