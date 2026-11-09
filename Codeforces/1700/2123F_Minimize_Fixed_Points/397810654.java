// Codeforces: https://codeforces.com/contest/2123/F
// Problem: Minimize Fixed Points
// Submission: https://codeforces.com/contest/2123/submission/397810654
// Language: Java 21
// Submitted: 2026-11-08T04:27:41.000Z
// Rating: 1700

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            boolean[] composite = new boolean[n + 1];
            ArrayList<Integer> primes = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                if (!composite[i]) {
                    primes.add(i);

                    for (int j = i * 2; j <= n; j += i) {
                        composite[j] = true;
                    }
                }
            }

            int[] ans = new int[n + 1];
            boolean[] used = new boolean[n + 1];

            ans[1] = 1;
            used[1] = true;

            for (int k = primes.size() - 1; k >= 0; k--) {
                int p = primes.get(k);
                ArrayList<Integer> group = new ArrayList<>();

                for (int j = p; j <= n; j += p) {
                    if (!used[j]) {
                        group.add(j);
                    }
                }

                int size = group.size();

                for (int i = 0; i < size; i++) {
                    int current = group.get(i);
                    int next = group.get((i + 1) % size);

                    ans[current] = next;
                    used[current] = true;
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(ans[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
