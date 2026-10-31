// Codeforces: https://codeforces.com/contest/2256/B
// Problem: Domino Tiles
// Submission: https://codeforces.com/contest/2256/submission/386386428
// Language: Java 21
// Submitted: 2026-08-09T16:17:49.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    private static final int MOD = 908244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            long[][] dp = new long[2][2];

            char c0 = s.charAt(0);
            char c1 = s.charAt(1);

            for (int j = 0; j < 2; ++j) {
                if (c0 != '?' && (c0 - '0') != j) continue;
                for (int k = 0; k < 2; ++k) {
                    if (c1 != '?' && (c1 - '0') != k) continue;
                    dp[j][k] = 1;
                }
            }

            for (int i = 2; i < n; ++i) {
                long[][] nextDp = new long[2][2];
                char currChar = s.charAt(i);

                for (int j = 0; j < 2; ++j) {
                    for (int k = 0; k < 2; ++k) {
                        if (dp[j][k] == 0) continue;

                        for (int nxt = 0; nxt < 2; ++nxt) {
                            if (currChar != '?' && (currChar - '0') != nxt) continue;

                            if (j != nxt) {
                                nextDp[k][nxt] = (nextDp[k][nxt] + dp[j][k]) % MOD;
                            }
                        }
                    }
                }
                dp = nextDp;
            }

            long ans = 0;
            for (int j = 0; j < 2; ++j) {
                for (int k = 0; k < 2; ++k) {
                    ans = (ans + dp[j][k]) % MOD;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
