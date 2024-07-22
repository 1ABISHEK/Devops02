import java.util.*;
public class perumutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.next();
         
         
         for(int i=0;i<s.length();i++){
             for(int j=0;j<s.length();j++){
                 for(int k=0;k<s.length();k++){
                     if(i!=j&&i!=k&&j!=k&&j!=i){
                         System.out.print(s.charAt(i));
                         System.out.print(s.charAt(j));
                         System.out.print(s.charAt(k));
                         System.out.println();
                     }
                 }
             }
         }
    }
    
}
