// Codeforces: https://codeforces.com/contest/1828/B
// Problem: Permutation Swap
// Submission: https://codeforces.com/contest/1828/submission/395887214
// Language: Java 21
// Submitted: 2026-10-24T15:38:08.000Z
// Rating: 900
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int ans = 0;

            for (int i = 0; i < n; i++) {
                ans = gcd(ans, Math.abs(a[i] - (i + 1)));
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
