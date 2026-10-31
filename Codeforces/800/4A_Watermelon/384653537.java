// Codeforces: https://codeforces.com/contest/4/A
// Problem: Watermelon
// Submission: https://codeforces.com/contest/4/submission/384653537
// Language: Java 21
// Submitted: 2026-07-28T15:22:35.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();

        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
