// Codeforces: https://codeforces.com/contest/1487/B
// Problem: Cat Cycle
// Submission: https://codeforces.com/contest/1487/submission/399201895
// Language: Java 21
// Submitted: 2026-11-20T07:01:11.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if (n % 2 == 1) {
                k += (k - 1) / (n / 2);
            }
            long ans = k % n == 0 ? n : k % n;
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
