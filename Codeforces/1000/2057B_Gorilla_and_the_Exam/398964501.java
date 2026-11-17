// Codeforces: https://codeforces.com/contest/2057/B
// Problem: Gorilla and the Exam
// Submission: https://codeforces.com/contest/2057/submission/398964501
// Language: Java 21
// Submitted: 2026-11-17T16:32:06.000Z
// Rating: 1000
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        Random rnd = new Random();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = n - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1);
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            Arrays.sort(a);

            ArrayList<Integer> counts = new ArrayList<>();
            int i = 0;
            while (i < n) {
                int j = i;
                while (j < n && a[j] == a[i]) j++;
                counts.add(j - i);
                i = j;
            }
            Collections.sort(counts);

            int distinct = counts.size();
            int remaining = k;
            for (int c : counts) {
                if (c <= remaining) {
                    remaining -= c;
                    distinct--;
                } else {
                    break;
                }
            }

            out.append(Math.max(1, distinct)).append('\n');
        }
        System.out.print(out);
    }
}
