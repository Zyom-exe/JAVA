package Arrays;

import java.util.Arrays;

public class Longest_subarray {
    static int subarray_sum(int[] a, int k){
        Arrays.sort(a);
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            if(s==k) {
                return i + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a={-3, 2, 1};
        System.out.println(subarray_sum(a,3));

    }
}
