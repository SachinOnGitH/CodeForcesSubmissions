// Codeforces: https://codeforces.com/contest/1873/A
// Problem: Short Sort
// Submission: https://codeforces.com/contest/1873/submission/385193141
// Language: Java 21
// Submitted: 2026-08-01T18:02:11.000Z
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

        for (int i = 0; i < t; i++) {
            String s = br.readLine().trim();

            if (s.charAt(0) == 'a' || s.charAt(1) == 'b' || s.charAt(2) == 'c') {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}
