package Binary_search;

public class Book_allocation {
    public static int bookallocation(int[]a,int m){
        int max=0, sum=0;
        int n=a.length;
        if(m>n)
            return -1;

        for(int i: a) {
            max=Math.max(max,i);
            sum+=i;
        }
        for(int i=max;i<=sum;i++){
            int count=students(a,i,n);
            if(count==m)
                return i;
        }
        return -1;
    }
    public static int bookallocationBS(int[]a,int m){
        int low=0, high=0;
        int n=a.length;
        if(m>n)
            return -1;

        for(int i: a) {
            low=Math.max(low,i);
            high+=i;
        }
       while(low<=high){
           int mid=(low+high)/2;
           int count=students(a,mid,n);
           if(count==m)
               return mid;
           else if(count<m)
              high=mid-1;
           else
               low=mid+1;
       }
        return -1;
    }


    private static int students(int[] a, int pages, int n) {
        int count=1, studpages=0;
        for(int i=0;i<n;i++){
            if(studpages+a[i]<=pages)
                studpages+=a[i];
            else{
                count++;
                studpages=a[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={25, 46, 28, 49, 24};
        int m = 4;
        int ans = bookallocation(arr, m);
        int ans2= bookallocationBS(arr,m);
        System.out.println("The answer is: " + ans);
        System.out.println("The answer is: " + ans2);
    }
}
