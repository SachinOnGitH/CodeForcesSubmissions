// Codeforces: https://codeforces.com/contest/1783/A
// Problem: Make it Beautiful
// Submission: https://codeforces.com/contest/1783/submission/391767357
// Language: Java 21
// Submitted: 2026-09-23T11:28:15.000Z
// Rating: 800
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                if (a[0] == a[n - 1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    System.out.print(a[n - 1]);
                    for (int i = 0; i < n - 1; i++) {
                        System.out.print(" " + a[i]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
