// Codeforces: https://codeforces.com/contest/160/A
// Problem: Twins
// Submission: https://codeforces.com/contest/160/submission/391985396
// Language: Java 21
// Submitted: 2026-09-25T12:44:29.000Z
// Rating: 900
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int totalSum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                totalSum += a[i];
            }

            Arrays.sort(a);

            int mySum = 0;
            int count = 0;

            for (int i = n - 1; i >= 0; i--) {
                mySum += a[i];
                count++;
                if (mySum > totalSum - mySum) {
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
