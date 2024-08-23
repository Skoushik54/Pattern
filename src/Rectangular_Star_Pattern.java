import java.util.Scanner;
public class Rectangular_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern_Method1(n);            // Time Complexity : O(n)
        PrintPattern_Method2(n);            // Time Complexity : O(n*n)
    }
    static void PrintPattern_Method1(int n){
        System.out.println("Method 1");
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void PrintPattern_Method2(int n) {
        System.out.println("Method 2");
        for (int j = 1; j <= n * n; j++) {
            if (j % n != 0) {
                System.out.print("*" + " ");
            } else {
                System.out.println("*");
            }
        }
    }
}
