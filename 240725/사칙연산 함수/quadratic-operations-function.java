import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        System.out.print(calc(a, o, c));
    }

    public static String calc(int a, String o, int c) {
        int result = 0;
        if(o.equals("+")) {
            result = a + c;
        } else if(o.equals("-")) {
            result = a - c;
        } else if(o.equals("/")) {
            result = a / c;
        } else if(o.equals("*")) {
            result = a * c;
        } else {
            return "False"; 
        }
        return a + " " + o + " " + c + " = " + result;
    }
}