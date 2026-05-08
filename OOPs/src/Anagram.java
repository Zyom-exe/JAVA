import java.util.Scanner;

public class Anagram {
    static boolean anagram(String s1,String s2){
        int[] map= new int[26];
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        for(int i=0;i<s1.length();i++){
            map[s1.charAt(i)-'a']++;
            map[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<s2.length();i++){
            if(map[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s1= in.next();
        String s2= in.next();
        System.out.println(anagram(s1,s2));
    }
}
