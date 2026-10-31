// Codeforces: https://codeforces.com/contest/1878/C
// Problem: Vasilije in Cacak
// Submission: https://codeforces.com/contest/1878/submission/390068513
// Language: Java 21
// Submitted: 2026-09-09T11:40:29.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long minSum = k * (k + 1) / 2;
            long maxSum = k * (2 * n - k + 1) / 2;

            if (x >= minSum && x <= maxSum) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}
