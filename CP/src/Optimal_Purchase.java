import java.util.*;
public class Optimal_Purchase {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long n=in.nextLong();
            long a=in.nextLong();
            long b=in.nextLong();
            long p1= (n/3)*b+(n%3)*a;
            long p2= n*b;
            long p3=n*a;
            long ans=Math.min(p1,(Math.min(p2,p3)));
            System.out.println(ans);
        }
    }
}
