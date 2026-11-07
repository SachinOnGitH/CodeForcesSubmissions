// Codeforces: https://codeforces.com/contest/2260/D
// Problem: Signs of Prefix Sums
// Submission: https://codeforces.com/contest/2260/submission/397497779
// Language: Java 21
// Submitted: 2026-11-05T16:32:48.000Z
// Rating: 1700
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean notLikeUs = s.charAt(0) == '0';
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '0' && s.charAt(i - 1) == '0') notLikeUs = true;
            }
            if (notLikeUs) {
                sb.append(-1).append('\n');
                continue;
            }

            boolean easyPeasy = true;
            boolean mid = true;
            int i = 0;
            while (i < n) {
                if (s.charAt(i) == '0') {
                    i++;
                    continue;
                }
                int j = i;
                while (j < n && s.charAt(j) != '0') j++;

                int squad = 0;
                int k = i;
                while (k < j) {
                    int e = k;
                    while (e < j && s.charAt(e) == s.charAt(k)) e++;
                    squad++;
                    int len = e - k;
                    boolean hasLeft = k > i;
                    boolean hasRight = e < j;
                    if (hasLeft && hasRight && len == 2) mid = false;
                    k = e;
                }

                if (squad > 1) easyPeasy = false;
                else if (j < n && (j - i) % 2 == 0) easyPeasy = false;
                i = j;
            }

            int ans;
            if (easyPeasy) ans = 1;
            else if (mid) ans = 2;
            else ans = 3;
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
