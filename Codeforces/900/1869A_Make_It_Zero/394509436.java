// Codeforces: https://codeforces.com/contest/1869/A
// Problem: Make It Zero
// Submission: https://codeforces.com/contest/1869/submission/394509436
// Language: Java 21
// Submitted: 2026-10-14T11:56:42.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            
            String line = br.readLine();
            st = new StringTokenizer(line);
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            if (n % 2 == 0) {
                sb.append(2).append("\n");
                sb.append("1 ").append(n).append("\n");
                sb.append("1 ").append(n).append("\n");
            } else {
                sb.append(4).append("\n");
                sb.append("1 ").append(n - 1).append("\n");
                sb.append("1 ").append(n - 1).append("\n");
                sb.append(n - 1).append(" ").append(n).append("\n");
                sb.append(n - 1).append(" ").append(n).append("\n");
            }
        }
        System.out.print(sb);
    }
}
