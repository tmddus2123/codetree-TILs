import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.print(num(s1) + num(s2));
    }

    public static int num(String str) {
        String num = "";

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch <= '9') {
                num += ch;
            }
        }
        return Integer.parseInt(num);
    }
}