package Strings;
import java.util.*;
public class Nesting_depth {
    public int maxDepth(String s) {
        int c = 0, index = 0, n = s.length() - 1, max = -1;
        if (s.startsWith("(") && s.endsWith(")")) {
            c++;
            index = 1;
            n--;
        }
        for (int i = index; i < n; i++) {
            if (s.charAt(i) == '(') {
                c++;
                max = Math.max(max, c);
            }
            if (s.charAt(i) == ')') {
                c--;
            }
        }
        return max;
    }

}
