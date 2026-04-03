package Strings;
import java.util.*;
public class Isomorphic_Strings {
    public static boolean rotateString(String s, String goal) {
        int i=0;
        String s1=s;
        while(i<s.length()-1){
            if(s1.equals(goal))
                return true;
            else{
                s1=s1.substring(1,s.length())+s1.charAt(0);
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde","abced"));
    }
}
