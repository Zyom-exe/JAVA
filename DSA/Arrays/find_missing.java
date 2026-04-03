package Arrays;

public class find_missing {
    static int find(int[]a){
        int s=0;
        int n=a.length+1;
        for (int j : a) {
            s += j;
        }
        int s1= (n*(n+1))/2;
        System.out.println(s);
        System.out.println(s1);

        if(s1==s)
            return -1;
        else
            return (s1-s);
    }

    public static void main(String[] args) {
        int[] arr = {8,9, 2, 4, 5, 3, 7, 1};
        System.out.println(find(arr));
    }
}
