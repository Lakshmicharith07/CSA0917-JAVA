import java.util.Scanner;
public class vowelsandconsonants {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=obj.next();
        String vow="",conso="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u') || (s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')){
                vow=vow+s.charAt(i);
            }
            else{
                conso=conso+s.charAt(i);
            }
        }
        System.out.print("\nvowels in the given string:"+vow);
        System.out.print("\nconsonants in the given string:"+conso);
    }
}
