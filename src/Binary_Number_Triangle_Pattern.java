import java.util.Scanner;
public class Binary_Number_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        for(int i=1;i<=n;i++){
            for(int  j=1;j<=i;j++){
                if((i+j) %2 ==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
