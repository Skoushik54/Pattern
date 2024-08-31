import java.util.Scanner;
public class Hollow_Rectangle_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        for(int i=0;i<n;i++){
            if(i==0){
                for(int q=0;q<n;q++){
                    System.out.print("*");
                }
            }else if(i==n-1){
                for(int q=0;q<n;q++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
