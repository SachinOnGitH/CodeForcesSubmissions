// Codeforces: https://codeforces.com/contest/1926/A
// Problem: Vlad and the Best of Five
// Submission: https://codeforces.com/contest/1926/submission/385191996
// Language: Java 21
// Submitted: 2026-08-01T17:52:58.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < t; i++) {
            String s = reader.readLine().trim();

            int countA = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'A') {
                    countA++;
                }
            }


            if (countA >= 3) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
