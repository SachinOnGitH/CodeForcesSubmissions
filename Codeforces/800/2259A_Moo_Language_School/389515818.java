// Codeforces: https://codeforces.com/contest/2259/A
// Problem: Moo Language School
// Submission: https://codeforces.com/contest/2259/submission/389515818
// Language: Java 21
// Submitted: 2026-09-05T15:24:42.000Z
// Rating: 800
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0){
            int n =sc.nextInt();
            int k =sc.nextInt();
            String s =sc.next();

            int cost = 0;
            int numFarms = n/k;

            for (int i=0;i<numFarms;i++){
                boolean hasZero = false;
                for (int j=0;j<k;j++){
                    if (s.charAt(i*k+j) == '0') {
                        hasZero = true;
                        break;
                    }
                }
                if (!hasZero){
                    cost++;
                }
            }
            System.out.println(cost);

        }
        sc.close();
    }
}
