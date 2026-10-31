// Codeforces: https://codeforces.com/contest/1829/G
// Problem: Hits Different
// Submission: https://codeforces.com/contest/1829/submission/393410771
// Language: Java 21
// Submitted: 2026-10-06T14:42:15.000Z
// Rating: 1600
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX_N = 2023;
    private static final long[] ans = new long[1000005];

    private static void precompute() {
        long[][] dp = new long[MAX_N + 1][];
        
        long currentVal = 1;
        for (int r = 1; r <= MAX_N; r++) {
            dp[r] = new long[r + 1];
            for (int c = 1; c <= r; c++) {
                if (currentVal > 1000000) {
                    break;
                }

                long valSq = currentVal * currentVal;

                long topLeft = (c - 1 >= 1) ? dp[r - 1][c - 1] : 0;
                long topRight = (c <= r - 1) ? dp[r - 1][c] : 0;
                long overlap = (c - 1 >= 1 && c <= r - 1) ? dp[r - 2][c - 1] : 0;

                dp[r][c] = valSq + topLeft + topRight - overlap;
                ans[(int) currentVal] = dp[r][c];

                currentVal++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        precompute();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        if (!st.hasMoreTokens()) return;

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            sb.append(ans[n]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
