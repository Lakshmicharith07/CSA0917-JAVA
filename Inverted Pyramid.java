import java.util.Scanner;

public class invertedpyramid {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the noof rows:: ");
        int n = obj.nextInt();
        for(int i=n; i>=0; i--)
        {
            for (int j=1*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

