public class AlphabetPattern {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            for (int j = 0; j < (ch - 'A' + 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
