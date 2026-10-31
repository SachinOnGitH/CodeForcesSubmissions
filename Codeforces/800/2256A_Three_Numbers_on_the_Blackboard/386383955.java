// Codeforces: https://codeforces.com/contest/2256/A
// Problem: Three Numbers on the Blackboard
// Submission: https://codeforces.com/contest/2256/submission/386383955
// Language: Java 21
// Submitted: 2026-08-09T16:09:50.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            long[] arr = new long[3];
            arr[0] = Long.parseLong(st.nextToken());
            arr[1] = Long.parseLong(st.nextToken());
            arr[2] = Long.parseLong(st.nextToken());

            Arrays.sort(arr);

            if (arr[2] > arr[0] + arr[1]) {
                arr[2] = arr[0] + arr[1];
                Arrays.sort(arr);
            }

            long minRange = arr[2] - arr[0];
            sb.append(minRange).append("\n");
        }

        System.out.print(sb);
    }
}
