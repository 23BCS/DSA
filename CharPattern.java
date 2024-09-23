public class CharPattern {
    public static void main(String[] args) {
        int n=5; 
        char ch='A';
        for(int i=1; i<=n; i++){
            for(int cha=1; cha<=i; cha++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
