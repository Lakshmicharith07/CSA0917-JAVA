import java.util.*;
public class meanmedmode{
    public static void main(String []args) {
        int mean,med,mode;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n],s=0;
        for(int i=0;i<n;i++){
            arr[i] =obj.nextInt();
            s=s+arr[i];
        }
        mean=(s/n);
        System.out.print("The mean of the array elements is:"+mean);

        Arrays.sort(arr);
        if(n%2==0){
            int k=((n/2)+((n/2)+1))/2;
            System.out.print("\nThe median of the numbers is ::"+arr[k]);
        }
        else{
            System.out.print("\nThe median of the numbers is ::"+arr[n/2]);
        }
    }

}
