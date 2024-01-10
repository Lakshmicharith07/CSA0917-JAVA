import java.util.Scanner;
public class simpleintrest {
    public static void main(String args[]){
        try {
            Scanner obj = new Scanner(System.in);
            System.out.print("enter the principle amt::");
            int p = obj.nextInt();
            System.out.print("enter the time::");
            int t = obj.nextInt();
            System.out.print("Are you an senior citizen::");
            char ch = obj.next().charAt(0);
            if (p <= 0)
                System.out.println("Enter valid amount.....");
            if (t <= 0)
                System.out.println("Enter no.of years correctly.....");
            if (ch == 'Y' || ch == 'y') {
                int r = 12;
                int intrest = (p * t * r) / 100;
                System.out.println("The intrest is :: " + intrest);
            }
            if (ch == 'N' || ch == 'n') {
                int r = 10;
                int intrest = (p * t * r) / 100;
                System.out.println("The intrest is :: " + intrest);
            }
        }
        catch(Exception e) {
            System.out.print("please enter valid details asked..");
        }
    }
}
