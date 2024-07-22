import java.util.*;
class IPP{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
       String rx = "^(25[0-5]|2[0-4]\\d|[01]?\\d{1,2})(\\.(25[0-5]|2[0-4]\\d|[01]?\\d{1,2})){3}$";
       boolean match=false;
       if(str.matches(rx)){
           match=true;
       }
       else{
           match=false;
       }
       if(match==true){
           System.out.println("valid ip add");
       }else{
           System.out.println("invalid ip add");
       }
       String arr[]=str.split("\\.");
       int ans[]=new int[arr.length]; 
       for(int i=0;i<arr.length;i++){
           ans[i]=Integer.parseInt(arr[i]);
       }
       for(int i=0;i<ans.length;i++){
           if(match==true){
            if(ans[0]>=1 && ans[0]<=126){
               System.out.println("Class A");
               break;
           }else if(ans[0]>=127 && ans[0]<=191){
               System.out.println("class B");
               break;
           }else if(ans[0]>=192 && ans[0]<=223){
                  System.out.println("Class C");
                  break;
           }else if(ans[0]>=224 && ans[0]<=239){
                 System.out.println("class D");
                 break;
           }else{
               System.out.println("ip add have no class");
