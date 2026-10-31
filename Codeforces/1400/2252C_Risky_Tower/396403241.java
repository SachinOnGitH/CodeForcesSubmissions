// Codeforces: https://codeforces.com/contest/2252/C
// Problem: Risky Tower
// Submission: https://codeforces.com/contest/2252/submission/396403241
// Language: Java 21
// Submitted: 2026-10-28T10:20:01.000Z
// Rating: 1400
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            long[] v = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) v[i] = Long.parseLong(st.nextToken());

            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) a[i][j] = Integer.parseInt(st.nextToken());
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int ans = m;

            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < m; j++) {
                    pq.offer(a[i][j]);
                    if (pq.size() > m) pq.poll();
                }

                Integer[] arr = pq.toArray(new Integer[0]);
                Arrays.sort(arr, Collections.reverseOrder());

                long sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum >= v[i]) {
                        ans = Math.min(ans, j + 1);
                        break;
                    }
                }
            }
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
