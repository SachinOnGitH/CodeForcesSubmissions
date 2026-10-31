// Codeforces: https://codeforces.com/contest/1726/A
// Problem: Mainak and Array
// Submission: https://codeforces.com/contest/1726/submission/395390813
// Language: Java 21
// Submitted: 2026-10-20T19:45:55.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int maxDiff = a[n - 1] - a[0];

            for (int i = 1; i < n; i++) {
                maxDiff = Math.max(maxDiff, a[i] - a[0]);
            }

            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, a[n - 1] - a[i]);
            }

            for (int i = 0; i < n; i++) {
                maxDiff = Math.max(maxDiff, a[i] - a[(i + 1) % n]);
            }

            sb.append(maxDiff).append("\n");
        }
        System.out.print(sb);
    }
}
