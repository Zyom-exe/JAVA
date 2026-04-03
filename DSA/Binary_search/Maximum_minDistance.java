package Binary_search;
import java.util.*;
public class Maximum_minDistance {
    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int n= stalls.length;
        int min=stalls[0];
        int max=stalls[n-1];
        int ans=0;
        for(int i=1;i<=max-min;i++) {
            if (canWePlace(stalls, i, cows))
                ans = i;
            else break;
        }
        return ans;
        
    }
    public static int aggressiveCowsBS(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int n= stalls.length;
        int low=stalls[0];
        int high=stalls[n-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(stalls,mid,cows))
            {
                low=mid+1;
                ans=mid;
            }
            else
                high=mid-1;
        }
        return ans;

    }


    static boolean canWePlace(int[] stalls, int dist, int cows) {
        int last=stalls[0], count=1;
        for(int i=1;i<stalls.length;i++) {
            if (stalls[i] - last >= dist) {
                count++;
                last = stalls[i];
            }
            if (count >= cows)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] stalls = {4,2,1,3,6};
        int cows = 2;
        System.out.println(aggressiveCows(stalls, cows));
    }
}

