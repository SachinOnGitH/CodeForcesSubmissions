// Codeforces: https://codeforces.com/contest/1896/A
// Problem: Jagged Swaps
// Submission: https://codeforces.com/contest/1896/submission/389610936
// Language: Java 21
// Submitted: 2026-09-06T05:19:16.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
            int firstElement = Integer.parseInt(st.nextToken());

            if (firstElement == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
