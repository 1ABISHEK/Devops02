import java.util.*;
public class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
             }
        }
         System.out.println("sum"+" "+sum);
    }
}
