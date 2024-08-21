//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Solution {
    public int strangePrinter(String s) {
        final int n = s.length();
        int[][] mem = new int[n][n];
        return strangePrinter(s, 0, n - 1, mem);
    }

    // Recursive helper method for strangePrinter
    private int strangePrinter(String s, int i, int j, int[][] mem) {
        if (i > j)
            return 0;
        if (mem[i][j] > 0)
            return mem[i][j];

        // Print s[i].
        mem[i][j] = strangePrinter(s, i + 1, j, mem) + 1;

        for (int k = i + 1; k <= j; k++)
            if (s.charAt(k) == s.charAt(i))
                mem[i][j] = Math.min(mem[i][j], strangePrinter(s, i, k - 1, mem) + //
                        strangePrinter(s, k + 1, j, mem));

        return mem[i][j];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String inputString = "aaabbb";

        int result = solution.strangePrinter(inputString);

        System.out.println("Minimum number of turns needed: " + result);

        System.out.print("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
