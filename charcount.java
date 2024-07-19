
public class Sef {
    public static void main(String[] args) {
        String s = "AbisHek@$$12";
        char c[] = s.toCharArray();
        int num=0;
        int ch = 0;
        int low = 0;
        int upp = 0;
        int spe = 0;
        for(int i=0;i<c.length;i++){
            char b = c[i];
            if(Character.isDigit(b)){
                num++;
            }
            else if(Character.isLetter(b)){
                ch++;
                
            if(Character.isUpperCase(b)){
                upp++;
            }
            
            else if(Character.isLowerCase(b)){
                low++;
            }
            
            }else{
                spe++;
            }
            
        }
        System.out.println("Digit        :"+num);
        System.out.println("Letter       :"+ch);
        System.out.println("UpperCase    :"+upp);
        System.out.println("LowerCase    :"+low);
        System.out.print("Special Char :"+spe);
    } 
}
