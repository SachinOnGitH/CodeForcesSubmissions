// Codeforces: https://codeforces.com/contest/2094/A
// Problem: Trippi Troppi
// Submission: https://codeforces.com/contest/2094/submission/385143750
// Language: Java 21
// Submitted: 2026-08-01T15:10:59.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        if (line == null || line.trim().isEmpty()) {
            return;
        }


        int t = Integer.parseInt(line.trim());
        StringBuilder output = new StringBuilder();


        for (int i = 0; i < t; i++) {
            String testCaseLine = br.readLine();
            if (testCaseLine == null) break;

            StringTokenizer st = new StringTokenizer(testCaseLine);
            if (st.countTokens() >= 3) {
                String word1 = st.nextToken();
                String word2 = st.nextToken();
                String word3 = st.nextToken();


                output.append(word1.charAt(0))
                        .append(word2.charAt(0))
                        .append(word3.charAt(0))
                        .append("\n");
            }
        }


        System.out.print(output);
    }
}
