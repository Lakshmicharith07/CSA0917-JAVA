import java.util.Scanner;
public class leapyear {
    public static void main(String []args){
        try {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the Date:");
            int date = obj.nextInt();
            System.out.print("Enter the month:");
            int mon = obj.nextInt();
            System.out.print("Enter the year:");
            int year = obj.nextInt();
            System.out.print("The date you entered is "+date+"/"+mon+"/"+year+".");
            if (((date >= 1) && (date <= 31)) && ((mon >= 1) && (mon <= 12))) {
                if ((year % 4 == 0) || (year % 400 == 0)) {
                    System.out.print("\nThe year you entered is leap year.");
                }
                else {
                    System.out.print("\nThe year you entered is not leap year.");
                }
            }
        }
        catch(Exception e){
            System.out.print("Enter valid date..");
        }
    }
}
