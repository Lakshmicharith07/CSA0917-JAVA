import java.util.Scanner;
public class arrownumberpattern {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the rows::");
        int n= obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}
