// Codeforces: https://codeforces.com/contest/1703/A
// Problem: YES or YES?
// Submission: https://codeforces.com/contest/1703/submission/384669907
// Language: Java 21
// Submitted: 2026-07-28T17:50:02.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");


        if (!st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return;
            st = new StringTokenizer(line);
        }
        int t = Integer.parseInt(st.nextToken());

        StringBuilder output = new StringBuilder();


        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            String s = st.nextToken();


            if (s.equalsIgnoreCase("YES")) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }


        System.out.print(output);
    }
}
