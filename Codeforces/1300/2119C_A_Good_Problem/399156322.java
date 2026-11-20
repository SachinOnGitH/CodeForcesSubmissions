// Codeforces: https://codeforces.com/contest/2119/C
// Problem: A Good Problem
// Submission: https://codeforces.com/contest/2119/submission/399156322
// Language: Java 21
// Submitted: 2026-11-19T16:05:20.000Z
// Rating: 1300
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if (n % 2 == 1) {
                sb.append(l).append("\n");
            } else if (n == 2) {
                sb.append(-1).append("\n");
            } else {
                long x = Long.highestOneBit(l) << 1;
                if (x > r) sb.append(-1).append("\n");
                else sb.append(k <= n - 2 ? l : x).append("\n");
            }
        }
        System.out.print(sb);
    }
}
