package Arrays;
import java.util.*;
public class Second_smallest_and_Largest {
    static int second_small(int[]a){
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if (a[i] < small) {
                second_small = small;
                small = a[i];
            } else if (a[i] < second_small && a[i] != small)
                second_small = a[i];
        }
        return second_small;
    }
    static int second_large(int[]a){
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if (a[i] > large) {
                second_large = large;
                large = a[i];
            } else if (a[i] > second_large && a[i] != large)
                second_large = a[i];
        }
        return second_large;
    }

    public static void main(String[] args) {
        int []a={3,5,6,3,1,8,9};
        System.out.println(Arrays.toString(a));
        System.out.println(second_small(a));
        System.out.println(second_large(a));
    }

}
