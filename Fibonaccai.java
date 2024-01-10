import java.util.Scanner;
public class fibonaccai {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=obj.nextInt();
        int a=0,b=1,i,sum=0;
        int fibo[] =new int[2*n+1];
        fibo[0]=0;fibo[1]=1;
        for(i=2;i<2*n+1;i++) {
            fibo[i]=a+b;
            a=b;
            b=fibo[i];
        }
        for(i=0;i<2*n+1;i++){
            if(i%2==0)
                sum=sum+fibo[i];
            System.out.print(fibo[i]+" ");
        }
        System.out.print("\n The sum of "+n+"even fibonacci series numbers is ::"+sum);
    }
}
