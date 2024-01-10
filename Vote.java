import java.util.Scanner;
public class vote {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Age::");
        int age=obj.nextInt();
        //int c= Integer.parseInt(age);
        //System.out.println("num"+c);
        if(age>=18){
            System.out.println("You are Eligible to vote.");
        }
        else{
            System.out.println("You are Not-Eligible to vote.");
            System.out.println("You have to wait for another "+(18-age)+" years to vote.");
        }

    }
}
