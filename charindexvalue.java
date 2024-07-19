import java.util.*;
public class Letter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=97;i<=122;i++){
            if(s.contains(Character.toString(i)))
                System.out.println(Character.toString(i)+" "+s.indexOf(i));
            else
                System.out.print(Character.toString(i)+" "+-1);
        }
    }
    
}
