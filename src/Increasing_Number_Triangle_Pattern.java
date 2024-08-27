import java.util.Scanner;
public class Increasing_Number_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        int i=1;
        for(int j=1;j<=n;j++){
            for(int k=1;k<=j;k++){
                System.out.print(i+++" ");
            }
            System.out.println();
        }
    }
}
