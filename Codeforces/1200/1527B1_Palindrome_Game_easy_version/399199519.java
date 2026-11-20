// Codeforces: https://codeforces.com/contest/1527/B1
// Problem: Palindrome Game (easy version)
// Submission: https://codeforces.com/contest/1527/submission/399199519
// Language: Java 21
// Submitted: 2026-11-20T06:25:47.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            int zeros = 0;
            for (int i = 0; i < n; i++) if (s.charAt(i) == '0') zeros++;
            if (zeros % 2 == 0 || zeros == 1) out.append("BOB\n");
            else out.append("ALICE\n");
        }
        System.out.print(out);
    }
}
