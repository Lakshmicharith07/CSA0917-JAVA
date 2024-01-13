import java.util.Scanner;
import java.io.*;
public class sorting {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter list size:");
        int s=obj.nextInt();
        String name[]= new String[s];
        String temp;int i,j;
        System.out.print("enter "+s+" names:");
        for(i=0;i<s;i++){
            name[i]=obj.next();
        }
        System.out.print("enter the choice(A/D):");
        char ch= obj.next().charAt(0);
        switch(ch){
            case 'A':
                for(i=0;i<s;i++){
                    for(j=i+1;j<s;j++){
                        if(name[i].compareTo(name[j]) > 0) {
                            temp=name[i];
                            name[i]=name[j];
                            name[j]=temp;
                        }
                        }
                    }
                System.out.print("Ascending order::\n");
                for(i=0;i<s;i++){
                    System.out.print(name[i]+" ");
                }
                break;
            case 'D' :
                for(i=0;i<s;i++){
                    for(j=i+1;j<s;j++){
                        if(name[i].compareTo(name[j]) < 0) {
                            temp=name[i];
                            name[i]=name[j];
                            name[j]=temp;
                        }
                    }
                }
                System.out.print("Descending order::\n");
                for(i=0;i<s;i++){
                    System.out.print(name[i]+" ");
                }
                break;
            default :
                System.out.print("Enter valid inputs.");
                break;
        }
    }
}
