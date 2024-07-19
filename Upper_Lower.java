
public class Def {

    public static void main(String[] args) {
        String s = "AbIsHeK";
        String s1 = s.toLowerCase();
        String s2 = s.toUpperCase();
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<i+1;j++){
                if(s.charAt(i)!=s1.charAt(j)){
                    System.out.print(s1.charAt(j));
                }
                
                else{
                    System.out.print(s2.charAt(j));
                }
            }
        }
    }
    
}
