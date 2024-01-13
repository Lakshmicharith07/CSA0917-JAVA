import java.util.Scanner;
public class digitreverse {
    public static void main(String []args){
        try{

        Scanner b=new Scanner(System.in);
        System.out.println("Enter the number::");
        int num= b.nextInt();
        int rem,rev=0;
            while (num > 0) {
                rem = num % 10;
                rev = (rev * 10) + rem;
                num = num / 10;
            }
            System.out.println("The reverse number is ::" + rev);
        }
        catch (Exception e)
        {
            System.out.println("Please enter valid number.");
        }
    }
}
