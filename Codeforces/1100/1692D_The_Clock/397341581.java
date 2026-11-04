// Codeforces: https://codeforces.com/contest/1692/D
// Problem: The Clock
// Submission: https://codeforces.com/contest/1692/submission/397341581
// Language: Java 21
// Submitted: 2026-11-04T14:00:47.000Z
// Rating: 1100

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int x = sc.nextInt();

            int h = Integer.parseInt(s.substring(0, 2));
            int m = Integer.parseInt(s.substring(3, 5));

            int time = h * 60 + m;
            int count = 0;

            HashSet<Integer> visited = new HashSet<>();

            while (!visited.contains(time)) {
                visited.add(time);

                int hours = time / 60;
                int minutes = time % 60;

                String current = String.format("%02d:%02d", hours, minutes);
                String reversed = new StringBuilder(current).reverse().toString();

                if (current.equals(reversed)) {
                    count++;
                }

                time = (time + x) % 1440;
            }

            System.out.println(count);
        }

        sc.close();
    }
}
