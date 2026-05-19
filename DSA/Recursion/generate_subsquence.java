package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generate_subsquence {
    static void recur(int index,String s, StringBuilder curr, List<String> ls){
        if(index==s.length()){
            System.out.println(curr);
            return;
        }
        curr.append(s.charAt(index));
        recur(index+1,s,curr,ls);
        curr.deleteCharAt(curr.length()-1);
        recur(index+1,s,curr,ls);
    }
    static void substring(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String s2=s.substring(i,j+1);
                System.out.print(s2+" ");
            }
            System.out.println();
        }
    }
    static void subsequence_sum(int i,List<Integer> ls, int[] a, int sum, int k){
        if(i==a.length){
            if(sum==k)
                System.out.println(ls);

            return;
        }
        ls.add(a[i]);
        sum+=a[i];
        subsequence_sum(i+1,ls,a,sum,k);
        ls.removeLast();
        sum-=a[i];
        subsequence_sum(i+1,ls,a,sum,k);
    }

    public static void main() {
        String s="abcde";
        List<Integer> ls = new ArrayList<>();
//        StringBuilder curr = new StringBuilder();
//        recur(0,s,curr,ls);
//        System.out.println(ls);
//        substring(s);
        int[] a={3,1,2};
        int k=3;
        subsequence_sum(0,ls,a,0,k);
    }
}
