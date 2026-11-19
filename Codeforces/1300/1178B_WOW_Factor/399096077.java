// Codeforces: https://codeforces.com/contest/1178/B
// Problem: WOW Factor
// Submission: https://codeforces.com/contest/1178/submission/399096077
// Language: Java 21
// Submitted: 2026-11-19T05:11:10.000Z
// Rating: 1300
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int n = s.length();

        long total = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'v' && s.charAt(i - 1) == 'v') total++;
        }

        long left = 0;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'o') {
                answer += left * (total - left);
            } else if (i > 0 && s.charAt(i - 1) == 'v') {
                left++;
            }
        }
        System.out.println(answer);
    }
}
