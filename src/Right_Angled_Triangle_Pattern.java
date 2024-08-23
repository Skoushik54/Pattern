import java.util.Scanner;
public class Right_Angled_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern_Method1(n);               // Time Complexity : O(n*n)
        PrintPattern_Method2(n);               // Time Complexity : O(n)
    }
    static void PrintPattern_Method1(int n){
        System.out.println("Method-1");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PrintPattern_Method2(int n){
        System.out.println("Method-2");
        String s="*";
        for(int i=1;i<=n;i++){
            System.out.println(s);
            s+=" *";
        }
    }
}
