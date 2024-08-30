import java.util.Scanner;
public class Symmetric_Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        for(int i=1,k=n;i<=n && k>0;i++,k--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*k)-2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2,k=n-1;i<=n && k>0;i++,k--){
            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*i)-2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
