// Codeforces: https://codeforces.com/contest/118/A
// Problem: String Task
// Submission: https://codeforces.com/contest/118/submission/389672100
// Language: Java 21
// Submitted: 2026-09-06T16:27:14.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e' || ch == 'u' || ch == 'i') {
                continue;
            }

            sb.append('.').append(ch);
        }

        System.out.println(sb.toString());
    }
}
