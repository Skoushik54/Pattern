import java.util.Scanner;
public class Number_Crown_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        for(int i=1,k=n-1;i<=n && k>=0;i++,k--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int q=1;q<=4*k;q++){
                System.out.print(" ");
            }
            for(int p=i;p>0;p--){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
