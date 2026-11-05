// Codeforces: https://codeforces.com/contest/2164/C
// Problem: Dungeon
// Submission: https://codeforces.com/contest/2164/submission/397445132
// Language: Java 21
// Submitted: 2026-11-05T07:25:31.000Z
// Rating: 1400

import java.util.*;

public class Main {

    static class Monster {
        int b, c;

        Monster(int b, int c) {
            this.b = b;
            this.c = c;
        }
    }

    static boolean useSword(TreeMap<Integer, Integer> swords, int health, boolean upgrade, int c) {
        Integer sword = swords.ceilingKey(health);

        if (sword == null) {
            return false;
        }

        int count = swords.get(sword);

        if (count == 1) {
            swords.remove(sword);
        } else {
            swords.put(sword, count - 1);
        }

        if (upgrade) {
            int newSword = Math.max(sword, c);
            swords.put(newSword, swords.getOrDefault(newSword, 0) + 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            TreeMap<Integer, Integer> swords = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                swords.put(x, swords.getOrDefault(x, 0) + 1);
            }

            Monster[] upgrade = new Monster[m];
            Monster[] normal = new Monster[m];

            int u = 0;
            int v = 0;

            int[] b = new int[m];
            int[] c = new int[m];

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                c[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                if (c[i] > 0) {
                    upgrade[u++] = new Monster(b[i], c[i]);
                } else {
                    normal[v++] = new Monster(b[i], 0);
                }
            }

            Arrays.sort(upgrade, 0, u, (a, d) -> Integer.compare(a.b, d.b));
            Arrays.sort(normal, 0, v, (a, d) -> Integer.compare(a.b, d.b));

            int ans = 0;

            for (int i = 0; i < u; i++) {
                if (useSword(swords, upgrade[i].b, true, upgrade[i].c)) {
                    ans++;
                }
            }

            for (int i = 0; i < v; i++) {
                if (useSword(swords, normal[i].b, false, 0)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
