// Codeforces: https://codeforces.com/contest/2218/A
// Problem: The 67th Integer Problem
// Submission: https://codeforces.com/contest/2218/submission/385229618
// Language: Java 21
// Submitted: 2026-08-02T05:32:51.000Z
// Rating: 800
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

        tokenizer = new StringTokenizer(line);
        int t = Integer.parseInt(tokenizer.nextToken());

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            line = reader.readLine();
            if (line == null) break;


            tokenizer = new StringTokenizer(line);
            int x = Integer.parseInt(tokenizer.nextToken());
            output.append(67).append("\n");
        }

        System.out.print(output);
    }
}
