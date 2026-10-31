// Codeforces: https://codeforces.com/contest/1904/A
// Problem: Forked!
// Submission: https://codeforces.com/contest/1904/submission/390328774
// Language: Java 21
// Submitted: 2026-09-11T15:44:20.000Z
// Rating: 900
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long xk = sc.nextLong();
            long yk = sc.nextLong();
            long xq = sc.nextLong();
            long yq = sc.nextLong();
            
            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};
            
            HashSet<String> kingAttacks = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                long nx = xk + dx[i];
                long ny = yk + dy[i];
                kingAttacks.add(nx + "," + ny);
            }
            
            HashSet<String> queenAttacks = new HashSet<>();
            for (int i = 0; i < 8; i++) {
                long nx = xq + dx[i];
                long ny = yq + dy[i];
                queenAttacks.add(nx + "," + ny);
            }
            
            int count = 0;
            for (String pos : kingAttacks) {
                if (queenAttacks.contains(pos)) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        sc.close();
    }
}
