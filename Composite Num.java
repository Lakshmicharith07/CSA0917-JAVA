import java.util.*;
public class compositenum {
    public static void main(String []args){
        int a,b,m,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the a and b values:");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.print("The composite numbers between "+a+" and "+b+" : ");
        for(i=a;i<=b;i++){
            m=i/2;
            for(j=2;j<=m;j++){
                if(i%2==0){
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
