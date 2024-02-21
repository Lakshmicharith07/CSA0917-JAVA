import java.util.Scanner;
public class factorial {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number::");
        int n=obj.nextInt(),fact=1;
        while(n!=0){
           fact=fact*n;
           n=n-1;
        }
        System.out.print("The factorial of given number is::"+fact);
    }
}
