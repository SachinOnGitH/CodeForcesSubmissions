// Codeforces: https://codeforces.com/contest/1889/A
// Problem: Qingshan Loves Strings 2
// Submission: https://codeforces.com/contest/1889/submission/392342032
// Language: Java 21
// Submitted: 2026-09-27T14:14:04.000Z
// Rating: 1300
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                if (n % 2 != 0) {
                    System.out.println(-1);
                    continue;
                }

                Deque<Character> deque = new ArrayDeque<>();
                for (char c : s.toCharArray()) {
                    deque.addLast(c);
                }

                List<Integer> ops = new ArrayList<>();
                int l = 0;
                boolean possible = true;

                while (!deque.isEmpty()) {
                    if (deque.peekFirst() != deque.peekLast()) {
                        deque.pollFirst();
                        deque.pollLast();
                        l++;
                    } else {
                        if (ops.size() >= 300) {
                            possible = false;
                            break;
                        }
                        if (deque.peekFirst() == '0') {
                            ops.add(l + deque.size());
                            deque.addLast('0');
                            deque.addLast('1');
                        } else {
                            ops.add(l);
                            deque.addFirst('1');
                            deque.addFirst('0');
                        }
                    }
                }

                if (!possible) {
                    System.out.println(-1);
                } else {
                    System.out.println(ops.size());
                    for (int i = 0; i < ops.size(); i++) {
                        System.out.print(ops.get(i) + (i == ops.size() - 1 ? "" : " "));
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
