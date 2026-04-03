package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Union_2_array {
    static List<Integer> union(int[] a1, int[] a2) {
        Set<Integer> s = new TreeSet<Integer>();
        for (int num : a1) {
            s.add(num);
        }
        for (int num : a2) {
            s.add(num);
        }
        return new ArrayList<>(s);
    }
    static List<Integer> union2(int[] a1, int[] a2){
        List<Integer> ls=new ArrayList<>();
        int i=0,j=0;
        int n1=a1.length;
        int n2=a2.length;
        while(i<n1 && j<n2) {
            if (a1[i] <= a2[j]) {
                if (ls.isEmpty() || ls.getLast() != a1[i]) {
                    ls.add(a1[i]);
                }
                i++;
            } else {
                if (ls.isEmpty() || ls.getLast() != a2[j]) {
                    ls.add(a2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if (ls.isEmpty() || ls.getLast() != a1[i]) {
                ls.add(a1[i]);
            }
            i++;
        }
        while(j<n2){
            if (ls.isEmpty() || ls.getLast() != a2[j]) {
                ls.add(a2[j]);
            }
            j++;
        }

       return ls;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 5, 5, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        System.out.println("Union of two sets: ");
        //System.out.println(union(arr1,arr2));
        System.out.println(union2(arr1, arr2));
    }
}




