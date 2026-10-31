// Codeforces: https://codeforces.com/contest/1890/A
// Problem: Doremy's Paint 3
// Submission: https://codeforces.com/contest/1890/submission/391671815
// Language: Java 21
// Submitted: 2026-09-22T14:08:43.000Z
// Rating: 800
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Map<Integer, Integer> freq = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    freq.put(x, freq.getOrDefault(x, 0) + 1);
                }

                if (freq.size() == 1) {
                    System.out.println("YES");
                } else if (freq.size() == 2) {
                    int[] counts = new int[2];
                    int idx = 0;
                    for (int count : freq.values()) {
                        counts[idx++] = count;
                    }
                    if (Math.abs(counts[0] - counts[1]) <= 1) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
