import java.util.Scanner;
public class factors {
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number::");
        int n=obj.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                k++;
            }
            else{
                continue;
            }
        }
        System.out.print("\nTotal number of Factors::"+k);
    }
}
