// Codeforces: https://codeforces.com/contest/1791/A
// Problem: Codeforces Checking
// Submission: https://codeforces.com/contest/1791/submission/384963505
// Language: Java 21
// Submitted: 2026-07-31T08:32:37.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        // Read number of test cases
        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());


        String target = "codeforces";
        HashSet<Character> targetSet = new HashSet<>();
        for (char ch : target.toCharArray()) {
            targetSet.add(ch);
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String token = reader.readLine();
            if (token == null) break;

            char c = token.trim().charAt(0);

            if (targetSet.contains(c)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }

        System.out.print(output);
    }
}
