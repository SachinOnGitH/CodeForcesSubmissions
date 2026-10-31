// Codeforces: https://codeforces.com/contest/1999/A
// Problem: A+B Again?
// Submission: https://codeforces.com/contest/1999/submission/385152565
// Language: Java 21
// Submitted: 2026-08-01T15:27:58.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int tensDigit=0,onesDigit=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;

        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());


        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());


            tensDigit = n / 10;
            onesDigit = n % 10;


            System.out.println(tensDigit + onesDigit);
        }
    }
}
