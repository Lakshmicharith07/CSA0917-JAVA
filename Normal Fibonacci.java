import java.util.Scanner;
public class normalfibonaci {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n = obj.nextInt();
        int a = 0, b = 1, i, sum = 0, fibo;
        System.out.print("\nFibonaccai series::");
        System.out.print(a+" "+b+" ");
        for (i = 2; i <n; i++) {
            fibo = a + b;
            System.out.print(fibo+" ");
            a = b;
            b = fibo;
        }
    }
}
