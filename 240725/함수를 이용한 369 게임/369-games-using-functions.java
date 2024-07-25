import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(isMulti(a, b));
    }

    public static int isMulti(int a, int b) {
        int result = 0;
        for(int i=a; i<=b; i++) {
            if(i % 3 == 0 || is369(String.valueOf(i))) {
                result++;
            }
        }
        return result;
    }

    public static boolean is369(String n) {
        for(int i=0; i<n.length(); i++) {
            if(n.charAt(i) == '3' || n.charAt(i) == '6' || n.charAt(i) == '9') {
                return true;
            }
        }
        return false;
    }
}