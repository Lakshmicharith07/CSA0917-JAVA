import java.util.Scanner;
public class skipping {
    public static void main(String args[]){
        try {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the m value:");
            int m=obj.nextInt();
            System.out.print("Enter the n value:");
            int n=obj.nextInt();
            System.out.print("Enter the K value:");
            int k=obj.nextInt();
            if(m>=n||k>(n-m))
                System.out.print("Invalid Input..");
            else if(m<0||n<0||k<0)
                System.out.print("Invalid Input..");
            else {
                while (m <= n) {
                    System.out.print(m + " ");
                    m = m + k + 1;
                }
            }
        }
        catch(Exception e){
            System.out.print("Please enter valid Input..");
        }
    }
}
