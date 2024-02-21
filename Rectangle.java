import java.io.*;
import java.util.Scanner;
public class rectangle {
    public static void main(String args[]){
        int r,c;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the rows:");
        r=obj.nextInt();
        System.out.print("Enter the cols:");
        c=obj.nextInt();
        System.out.print("Enter the charcter:");
        char ch=obj.next().charAt(0);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }}
