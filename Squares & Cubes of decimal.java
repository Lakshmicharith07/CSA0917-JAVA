import java.util.Scanner;
public class squaresandcubesofdecimal {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the decimal number::");
        float n=obj.nextFloat();
        System.out.print("\nThe square of the decimal number:"+n*n);
        System.out.print("\nThe cube of the decimal number:"+n*n*n);
    }
}
