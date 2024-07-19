import java.util.*;
public class Ascii {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        char c[] = s.toCharArray();
        for(char i=0;i<c.length;i++){
            if(c[i]>=97&&c[i]<=122)
            if(c[i]%2==0)
                    System.out.print(c[i]);
    }
    }
    
}
