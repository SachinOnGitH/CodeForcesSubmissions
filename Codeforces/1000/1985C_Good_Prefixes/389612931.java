// Codeforces: https://codeforces.com/contest/1985/C
// Problem: Good Prefixes
// Submission: https://codeforces.com/contest/1985/submission/389612931
// Language: Java 21
// Submitted: 2026-09-06T05:51:08.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            line = br.readLine();
            while (line == null || line.trim().isEmpty()) {
                line = br.readLine();
            }
            int n = Integer.parseInt(line.trim());

            StringTokenizer st = new StringTokenizer(br.readLine());

            long sum = 0;
            long maxVal = 0;
            int goodPrefixCount = 0;

            for (int i = 0; i < n; i++) {
                long val = Long.parseLong(st.nextToken());
                sum += val;
                maxVal = Math.max(maxVal, val);

                if (sum == 2 * maxVal) {
                    goodPrefixCount++;
                }
            }

            System.out.println(goodPrefixCount);
        }
    }
}
