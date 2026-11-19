// Codeforces: https://codeforces.com/contest/1679/B
// Problem: Stone Age Problem
// Submission: https://codeforces.com/contest/1679/submission/399147969
// Language: Java 21
// Submitted: 2026-11-19T14:40:58.000Z
// Rating: 1200
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in));
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int q = (int) in.nval;

        long[] value = new long[n];
        int[] stamp = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            value[i] = (long) in.nval;
            sum += value[i];
        }

        long globalValue = 0;
        int globalStamp = 0;

        StringBuilder out = new StringBuilder();
        for (int step = 1; step <= q; step++) {
            in.nextToken();
            int type = (int) in.nval;
            if (type == 1) {
                in.nextToken();
                int i = (int) in.nval - 1;
                in.nextToken();
                long x = (long) in.nval;

                if (stamp[i] < globalStamp) {
                    value[i] = globalValue;
                }
                sum += x - value[i];
                value[i] = x;
                stamp[i] = step;
            } else {
                in.nextToken();
                long x = (long) in.nval;
                globalValue = x;
                globalStamp = step;
                sum = (long) n * x;
            }
            out.append(sum).append('\n');
        }
        System.out.print(out);
    }
}
