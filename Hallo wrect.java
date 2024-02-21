import java.io.*;
import java.util.Scanner;
public class hallowrect {
    public static void main(String args[]){
        int r,c,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the rows:");
        r=obj.nextInt();
        System.out.print("Enter the cols:");
        c=obj.nextInt();
        System.out.print("Enter the charcter:");
        char ch=obj.next().charAt(0);
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i==0 || i==r-1 || j==0 || j==c-1){
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }}
