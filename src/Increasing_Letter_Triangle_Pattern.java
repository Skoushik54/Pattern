import java.util.Scanner;
public class Increasing_Letter_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintPattern(n);
    }

    static void PrintPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int val = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) val++ + " ");
            }
            System.out.println();
        }
    }
}
