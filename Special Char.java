import java.util.*;
public class specialchar {
    public static void main(String []args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the line with special charcters without gap::");
        String s = obj.next();
        int l=s.length();
        int al=0,num=0,sp=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<l;i++){
            if ((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')){
                al++;
            }
            else if(ch[i]>='0' && ch[i]<='9'){
                num++;
            }
            else if(ch[i]==' '){
                continue;
            }
            else{
                System.out.print(ch[i]+" ");
                sp++;
            }
        }
        System.out.print("\nno.of special charcters in the line is::"+sp);

    }
}
