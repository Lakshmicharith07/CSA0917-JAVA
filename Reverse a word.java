import java.util.Scanner;
public class reverseword {
    public static void main(String args[] ){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the string::");
        String b= a.nextLine();
        char ch;
        String rev="";
        for(int i=0;i<b.length();i++){
            ch=b.charAt(i);
            rev= ch + rev;
        }
        System.out.println(rev);
    }
}
