import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char ch = s.charAt(0);
        char change = s.charAt(1);

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == change) {
                System.out.print(ch);
            } else {
                System.out.print(s.charAt(i));            
            }
        }
    }
}