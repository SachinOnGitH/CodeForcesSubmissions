// Codeforces: https://codeforces.com/contest/2163/A
// Problem: Souvlaki VS. Kalamaki
// Submission: https://codeforces.com/contest/2163/submission/389611498
// Language: Java 21
// Submitted: 2026-09-06T05:28:45.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            line = br.readLine();
            while (line == null || line.trim().isEmpty()) {
                line = br.readLine();
            }
            int n = Integer.parseInt(line.trim());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);

            boolean possible = true;
            for (int i = 1; i < n - 1; i += 2) {
                if (a[i] != a[i + 1]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
