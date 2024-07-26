import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(charNumber(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean charNumber(String str) {
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}