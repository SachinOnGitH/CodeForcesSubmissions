// Codeforces: https://codeforces.com/contest/2093/D
// Problem: Skibidi Table
// Submission: https://codeforces.com/contest/2093/submission/396568018
// Language: Java 21
// Submitted: 2026-10-29T13:28:41.000Z
// Rating: 1400
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int q = Integer.parseInt(br.readLine().trim());

            while (q-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String type = st.nextToken();

                if (type.equals("->")) {
                    long x = Long.parseLong(st.nextToken()) - 1;
                    long y = Long.parseLong(st.nextToken()) - 1;

                    long num = 0;
                    for (int i = n - 1; i >= 0; i--) {
                        long xb = (x >> i) & 1;
                        long yb = (y >> i) & 1;
                        long quad;
                        if (xb == 0 && yb == 0) quad = 0;
                        else if (xb == 1 && yb == 1) quad = 1;
                        else if (xb == 1 && yb == 0) quad = 2;
                        else quad = 3;
                        num = num * 4 + quad;
                    }
                    out.append(num + 1).append('\n');
                } else {
                    long d = Long.parseLong(st.nextToken()) - 1;

                    long x = 0;
                    long y = 0;
                    for (int i = n - 1; i >= 0; i--) {
                        long quad = (d >> (2 * i)) & 3;
                        x <<= 1;
                        y <<= 1;
                        if (quad == 1) {
                            x |= 1;
                            y |= 1;
                        } else if (quad == 2) {
                            x |= 1;
                        } else if (quad == 3) {
                            y |= 1;
                        }
                    }
                    out.append(x + 1).append(' ').append(y + 1).append('\n');
                }
            }
        }

        System.out.print(out);
    }
}
