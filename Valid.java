import java.util.Scanner;
public class valid {
    public static void main(String []args){
        Scanner b= new Scanner(System.in);
        System.out.println("enter the username::");
        String s1= b.nextLine();
        System.out.println("Re enter the username::");
        String s2= b.nextLine();
        boolean result=s1.equals(s2);
        if (result==true)
        {
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid inputs");
        }

    }
}
