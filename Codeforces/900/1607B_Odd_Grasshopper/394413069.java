// Codeforces: https://codeforces.com/contest/1607/B
// Problem: Odd Grasshopper
// Submission: https://codeforces.com/contest/1607/submission/394413069
// Language: Java 21
// Submitted: 2026-10-13T14:48:46.000Z
// Rating: 900
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());

            long rem = n % 4;
            long ans = x;

            if (x % 2 == 0) {
                if (rem == 1) ans = x - n;
                else if (rem == 2) ans = x + 1;
                else if (rem == 3) ans = x + n + 1;
            } else {
                if (rem == 1) ans = x + n;
                else if (rem == 2) ans = x - 1;
                else if (rem == 3) ans = x - n - 1;
            }

            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}
