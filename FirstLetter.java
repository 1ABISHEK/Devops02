public class FirstLetter {

    
    public static void main(String[] args) {
        String s = " hi am abishek";
        char c[] = s.toCharArray();  
        for(int i=0;i<c.length;i++){
            if(c[i]==' ')
            System.out.print(c[i+1]);
    }
