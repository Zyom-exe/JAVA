import java.util.*;
public class Q_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int xor = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                xor ^= x;
                max = Math.max(max, x);
            }

            if (n % 2 == 0)
                System.out.println(xor);
            else
                System.out.println(max);
        }
    }
}