// Codeforces: https://codeforces.com/contest/1413/A
// Problem: Finding Sasuke
// Submission: https://codeforces.com/contest/1413/submission/385171898
// Language: Java 21
// Submitted: 2026-08-01T16:15:00.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i += 2) {
                sb.append(-a[i + 1]).append(" ").append(a[i]).append(" ");
            }
            sb.append("\n");
        }


        System.out.print(sb);
    }
}
