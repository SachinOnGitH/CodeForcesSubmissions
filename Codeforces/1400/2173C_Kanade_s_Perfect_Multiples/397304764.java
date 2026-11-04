// Codeforces: https://codeforces.com/contest/2173/C
// Problem: Kanade's Perfect Multiples
// Submission: https://codeforces.com/contest/2173/submission/397304764
// Language: Java 21
// Submitted: 2026-11-04T07:46:44.000Z
// Rating: 1400

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            ArrayList<Integer> values = new ArrayList<>(set);
            Collections.sort(values);

            HashSet<Integer> covered = new HashSet<>();
            ArrayList<Integer> ans = new ArrayList<>();

            for (int b : values) {
                if ((long) k / b > set.size()) {
                    continue;
                }

                boolean valid = true;
                boolean useful = false;

                for (long x = b; x <= k; x += b) {
                    int v = (int) x;

                    if (!set.contains(v)) {
                        valid = false;
                        break;
                    }

                    if (!covered.contains(v)) {
                        useful = true;
                    }
                }

                if (valid && useful) {
                    ans.add(b);

                    for (long x = b; x <= k; x += b) {
                        covered.add((int) x);
                    }
                }
            }

            if (covered.size() != set.size()) {
                out.append("-1\n");
            } else {
                out.append(ans.size()).append('\n');

                for (int b : ans) {
                    out.append(b).append(' ');
                }

                out.append('\n');
            }
        }

        System.out.print(out);
        sc.close();
    }
}
