// Codeforces: https://codeforces.com/contest/1692/A
// Problem: Marathon
// Submission: https://codeforces.com/contest/1692/submission/384898595
// Language: Java 21
// Submitted: 2026-07-30T15:51:18.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int t = Integer.parseInt(br.readLine());


        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int count = 0;
            if (b > a) count++;
            if (c > a) count++;
            if (d > a) count++;


            System.out.println(count);
        }
    }
}
