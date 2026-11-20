// Codeforces: https://codeforces.com/contest/1536/B
// Problem: Prinzessin der Verurteilung
// Submission: https://codeforces.com/contest/1536/submission/399220529
// Language: Java 21
// Submitted: 2026-11-20T10:39:50.000Z
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
            boolean done = false;
            for (int len = 1; len <= 3 && !done; len++) {
                int size = 1;
                for (int i = 0; i < len; i++) size *= 26;
                boolean[] seen = new boolean[size];
                for (int i = 0; i + len <= n; i++) {
                    int v = 0;
                    for (int j = 0; j < len; j++) v = v * 26 + (s.charAt(i + j) - 'a');
                    seen[v] = true;
                }
                for (int v = 0; v < size; v++) {
                    if (!seen[v]) {
                        char[] ch = new char[len];
                        int x = v;
                        for (int j = len - 1; j >= 0; j--) {
                            ch[j] = (char) ('a' + x % 26);
                            x /= 26;
                        }
                        out.append(new String(ch)).append('\n');
                        done = true;
                        break;
                    }
                }
            }
        }
        System.out.print(out);
    }
}
