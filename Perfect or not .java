import java.util.Scanner;
public class perfectornot {
    public static void main(String []args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number::");
        int n = obj.nextInt(), sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.print("\nnumber "+n+" is a perfect number.");
        }
        else{
            System.out.print("\nnumber "+n+" is not a perfect number.");
        }
    }
}
