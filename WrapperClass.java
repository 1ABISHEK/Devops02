public class WrapperClass{  
public static void main(String args[]){  
        byte b=10;  
        short s=20;  
        int i=30;  
        long l=40;  
        float f=50.0F;  
        double d=60.0D;  
        char c='a';  
        boolean b2=true;  
        
        Byte obj=new Byte(b);
        Short obj1=new Short(s);
        Integer obj2=new Integer(i);
        Long obj3=new Long(l);
        Float obj4=new Float(f);
        Double obj5=new Double(d);
        Character obj6=new Character(c);
        Boolean obj7=new Boolean(b2);
       
         System.out.println("Byte     :"+obj);
        System.out.println("Short     :"+obj1);
        System.out.println("Integer   :"+obj2);
        System.out.println("Long      :"+obj3);
        System.out.println("Float     :"+obj4);
        System.out.println("Double    :"+obj5);
        System.out.println("Character :"+obj6);
        System.out.println("Boolean   :"+obj7);
        }
}

