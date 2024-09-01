import java.util.Scanner;
public class The_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintPattern(n);
    }
    static void PrintPattern(int n){
        int size=2*n-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(n-Math.min(Math.min(i,j),Math.min(size-i-1,size-1-j)));
            }
            System.out.println();
        }
    }
}

