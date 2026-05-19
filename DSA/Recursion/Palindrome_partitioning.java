package Recursion;
import java.util.*;
public class Palindrome_partitioning {
    static List<List<String>> partition(String s ){
        List<List<String>> res= new ArrayList<>();
        helper(0,s,new ArrayList<>(),res);
        return res;
    }

    private static void helper(int index,String s, List<String> substring, List<List<String>> res) {
        if(index==s.length()){
            res.add(new ArrayList<>(substring));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPlaindrome(s,index,i)){
                substring.add(s.substring(index,i+1));
                helper(index+1,s,substring,res);
                substring.removeLast();
            }
        }
    }
    static boolean isPlaindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }

    public static void main() {
        String s="aabb";
        System.out.println(partition(s));
    }
}
