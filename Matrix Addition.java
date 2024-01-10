import java.util.Scanner;
public class matrixaddition {
    public static void main(String args[]) {
        int i, j, r, cl;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the rows:");
        r = obj.nextInt();
        System.out.print("Enter the cols:");
        cl = obj.nextInt();
        int a[][]=new int[r][cl];
        int b[][]=new int[r][cl];
        int c[][]=new int[r][cl];
        System.out.print("Enter the 1st matrix values::\n");
        for (i = 0; i < r; i++) {
            for (j = 0; j<cl; j++) {
                a[i][j]=obj.nextInt();
            }
        }

        System.out.print("Enter the 2st matrix values::\n");
        for (i = 0; i < r; i++) {
            for (j = 0; j<cl; j++) {
                b[i][j]=obj.nextInt();
            }
        }

        System.out.print("Sum of matrices is::\n");
        for (i = 0; i < r; i++) {
            for (j = 0; j<cl; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j<cl; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
