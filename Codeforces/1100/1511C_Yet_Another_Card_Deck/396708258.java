// Codeforces: https://codeforces.com/contest/1511/C
// Problem: Yet Another Card Deck
// Submission: https://codeforces.com/contest/1511/submission/396708258
// Language: Java 21
// Submitted: 2026-10-30T15:44:51.000Z
// Rating: 1100
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] pos = new int[51];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (pos[a] == 0) {
                pos[a] = i;
            }
        }
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(st.nextToken());
            int p = pos[t];
            sb.append(p).append(' ');
            for (int c = 1; c <= 50; c++) {
                if (pos[c] != 0 && pos[c] < p) {
                    pos[c]++;
                }
            }
            pos[t] = 1;
        }
        System.out.println(sb.toString().trim());
    }
}
