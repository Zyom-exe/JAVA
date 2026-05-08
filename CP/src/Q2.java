import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0) {
            int[] a= new int[7];
            for(int i=0;i<7;i++){
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            int sum=0;
            for(int i=0;i<6;i++) {
                sum = sum + (-1) * a[i];
            }
            sum=sum+a[6];
            System.out.println(sum);
        }
    }
}
