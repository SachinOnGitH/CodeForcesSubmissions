// Codeforces: https://codeforces.com/contest/2275/C
// Problem: Unrequited Love
// Submission: https://codeforces.com/contest/2275/submission/393579137
// Language: Java 21
// Submitted: 2026-10-07T15:39:55.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        StringBuilder sb = new StringBuilder();

        if (!sc.hasNext()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            int numTriads = n - 4;
            if (numTriads <= 0) {
                sb.append(0).append("\n");
                continue;
            }

            long[] v = new long[numTriads + 1];
            HashMap<Long, Integer> freq = new HashMap<>();

            for (int i = 1; i <= numTriads; i++) {
                v[i] = a[i] + a[i + 2] - a[i + 4];
                freq.put(v[i], freq.getOrDefault(v[i], 0) + 1);
            }

            long totalPairs = 0;

            for (int count : freq.values()) {
                totalPairs += (long) count * (count - 1) / 2;
            }

            for (int x = 1; x + 2 <= numTriads; x++) {
                if (v[x] == v[x + 2]) {
                    totalPairs--;
                }
            }

            for (int x = 1; x + 4 <= numTriads; x++) {
                if (v[x] == v[x + 4]) {
                    totalPairs--;
                }
            }

            sb.append(totalPairs).append("\n");
        }

        System.out.print(sb);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean hasNext() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return false;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return false;
                }
            }
            return true;
        }

        String next() {
            if (hasNext()) return st.nextToken();
            return null;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
