import java.util.Scanner;

public class numberRAT {
        public static void main(String args[])
        {
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter the noof rows:: ");
            int n= obj.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
                System.out.print('\n');
            }


        }
    }
