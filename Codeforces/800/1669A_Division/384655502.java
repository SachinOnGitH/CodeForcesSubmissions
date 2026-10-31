// Codeforces: https://codeforces.com/contest/1669/A
// Problem: Division?
// Submission: https://codeforces.com/contest/1669/submission/384655502
// Language: Java 21
// Submitted: 2026-07-28T15:41:13.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = reader.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int rating = Integer.parseInt(reader.readLine().trim());

            if (rating >= 1900) {
                sb.append("Division 1\n");
            } else if (rating >= 1600) {
                sb.append("Division 2\n");
            } else if (rating >= 1400) {
                sb.append("Division 3\n");
            } else {
                sb.append("Division 4\n");
            }
        }

        System.out.print(sb.toString());
    }
}
