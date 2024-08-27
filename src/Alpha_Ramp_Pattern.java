import java.util.Scanner;
public class Alpha_Ramp_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        int val=64;
        for(int i=1;i<=n;i++){
            val++;
            for(int j=1;j<=i;j++){
                System.out.print((char)(val)+" ");
            }
            System.out.println();
        }
    }
}
