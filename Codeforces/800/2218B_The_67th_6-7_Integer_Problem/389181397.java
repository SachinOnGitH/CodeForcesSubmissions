// Codeforces: https://codeforces.com/contest/2218/B
// Problem: The 67th 6-7 Integer Problem
// Submission: https://codeforces.com/contest/2218/submission/389181397
// Language: Java 21
// Submitted: 2026-09-02T10:32:49.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int totalSum = 0;
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < 7; i++) {
                int val = Integer.parseInt(st.nextToken());
                totalSum += val;
                maxVal = Math.max(maxVal, val);
            }

            int ans = 2 * maxVal - totalSum;
            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
