// Codeforces: https://codeforces.com/contest/2260/C
// Problem: Maximize XOR, Minimize Operations
// Submission: https://codeforces.com/contest/2260/submission/390196189
// Language: Java 21
// Submitted: 2026-09-10T10:54:14.000Z
// Rating: 1300
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            long x = fs.nextLong();
            long y = fs.nextLong();

            long sum = x + y;
            long remX = x;

            for (int b = 61; b >= 0; b--) {
                long bitValue = 1L << b;
                if ((sum & bitValue) != 0 && remX >= bitValue) {
                    remX -= bitValue;
                }
            }

            sb.append(sum).append(" ").append(remX).append("\n");
        }

        System.out.print(sb);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return "";
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
