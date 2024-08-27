import java.util.Scanner;
public class Alpha_Hill_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        for(int i=1,q=n;i<=n && q>0;i++,q--){
            for(int k=1;k<(2*q)-1;k++){
                System.out.print(" ");
            }
            int val=65;
            for(int j=1;j<=i;j++){
                System.out.print((char)val++ +" ");
            }
            val--;
            for(int t=1;t<i;t++){
                System.out.print((char)--val+" ");
            }
            System.out.println();
        }
    }
}
