package Binary_search;

import java.util.Scanner;

public class Nth_root {
    static int root(int num, int N){
        int low=1; int high=num;

        while(low<=high) {
            int mid=(low+high)/2;
            if(Math.pow(mid,N)==num)
                return mid;
            else if(Math.pow(mid,N)<num) {
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
        System.out.println(root(n,3));

    }
}
