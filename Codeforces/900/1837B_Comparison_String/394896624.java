// Codeforces: https://codeforces.com/contest/1837/B
// Problem: Comparison String
// Submission: https://codeforces.com/contest/1837/submission/394896624
// Language: Java 21
// Submitted: 2026-10-17T06:06:02.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                line = reader.readLine();
                if (line == null) break;
                tokenizer = new StringTokenizer(line);
            }
            int n = Integer.parseInt(tokenizer.nextToken());

            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                line = reader.readLine();
                if (line == null) break;
                tokenizer = new StringTokenizer(line);
            }
            String s = tokenizer.nextToken();

            int maxStreak = 1;
            int currentStreak = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentStreak++;
                } else {
                    currentStreak = 1;
                }
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            }

            output.append(maxStreak + 1).append("\n");
        }
        System.out.print(output);
    }
}
