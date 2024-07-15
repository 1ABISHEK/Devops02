class Even_String_Length{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String sc = s.nextLine();
for(String w : s.split(" ")){
            if(w.length()%2==0){
                System.out.println(w+" "+w.length());
            }
        }
}
}
