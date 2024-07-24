import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >=65 && ch <= 90) {
                System.out.print((char) (ch + 32));
            } else {
                System.out.print((char) (ch - 32));
            }
        }
    }
}