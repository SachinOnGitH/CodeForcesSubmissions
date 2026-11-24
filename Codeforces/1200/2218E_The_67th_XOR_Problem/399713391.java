// Codeforces: https://codeforces.com/contest/2218/E
// Problem: The 67th XOR Problem
// Submission: https://codeforces.com/contest/2218/submission/399713391
// Language: Java 21
// Submitted: 2026-11-24T14:45:35.000Z
// Rating: 1200
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(a[0]);
                continue;
            }
            int answer = 0;
            int mask = 0;
            for (int bit = 30; bit >= 0; bit--) {
                mask |= 1 << bit;
                HashSet<Integer> prefixes = new HashSet<>();
                for (int x : a) {
                    prefixes.add(x & mask);
                }
                int candidate = answer | (1 << bit);
                for (int p : prefixes) {
                    if (prefixes.contains(p ^ candidate)) {
                        answer = candidate;
                        break;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
