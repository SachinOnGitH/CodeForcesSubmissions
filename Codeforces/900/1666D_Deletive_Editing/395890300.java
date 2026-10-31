// Codeforces: https://codeforces.com/contest/1666/D
// Problem: Deletive Editing
// Submission: https://codeforces.com/contest/1666/submission/395890300
// Language: Java 21
// Submitted: 2026-10-24T16:04:45.000Z
// Rating: 900
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();

            int[] freq = new int[26];

            for (int i = 0; i < t.length(); i++) {
                freq[t.charAt(i) - 'A']++;
            }

            int j = t.length() - 1;
            boolean possible = true;

            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                int idx = c - 'A';

                if (freq[idx] == 0) {
                    continue;
                }

                if (j < 0 || c != t.charAt(j)) {
                    possible = false;
                    break;
                }

                freq[idx]--;
                j--;
            }

            if (j >= 0) {
                possible = false;
            }

            sb.append(possible ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}
