package Binary_search;

import java.util.Scanner;

public class Square_root {
    static int root(int n){
        int low=1; int high=n;

        while(low<=high) {
            int mid=(low+high)/2;
            if(mid*mid==n)
                return mid;
            else if(mid*mid<n) {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return high;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(root(n));

    }
}
