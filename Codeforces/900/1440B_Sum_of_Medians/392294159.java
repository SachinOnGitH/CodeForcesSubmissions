// Codeforces: https://codeforces.com/contest/1440/B
// Problem: Sum of Medians
// Submission: https://codeforces.com/contest/1440/submission/392294159
// Language: Java 21
// Submitted: 2026-09-27T06:53:24.000Z
// Rating: 900
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                long[] a = new long[n * k];
                for (int i = 0; i < n * k; i++) {
                    a[i] = sc.nextLong();
                }

                Arrays.sort(a);

                int medianIndexOffset = n - (n + 1) / 2 + 1;
                long sum = 0;
                int currentIdx = n * k - 1 - (medianIndexOffset - 1);

                for (int i = 0; i < k; i++) {
                    sum += a[currentIdx];
                    currentIdx -= medianIndexOffset;
                }

                System.out.println(sum);
            }
        }
        sc.close();
    }
}
