import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            List<Integer> result = new ArrayList<>();

            int left = 1;
            int right = 3 * n;

            for (int i = 0; i < n; i++) {
                result.add(left++);
                result.add(left++);
                result.add(right--);
            }

            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
