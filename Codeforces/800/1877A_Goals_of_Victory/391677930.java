// Codeforces: https://codeforces.com/contest/1877/A
// Problem: Goals of Victory
// Submission: https://codeforces.com/contest/1877/submission/391677930
// Language: Java 21
// Submitted: 2026-09-22T15:00:15.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            StringTokenizer st = new StringTokenizer(reader.readLine());

            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += Integer.parseInt(st.nextToken());
            }

            System.out.println(-sum);
        }
    }
}
