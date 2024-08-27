import java.util.Scanner;
public class Symmetric_Void_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        for(int i=n,k=1;i>0 && k<=n;i--,k++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*k)-2;j++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n,k=1;i>0 && k<=n;i--,k++){
            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*i)-2;j++){
                System.out.print("  ");
            }
            for(int j=k;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
