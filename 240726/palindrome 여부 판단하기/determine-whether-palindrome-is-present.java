import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split("");
        if(check(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean check(String[] str) {
        int len = str.length;

        for(int i=0; i<len/2; i++) {
            if(!str[i].equals(str[len - i - 1])) {
                return false;
            }
        }
        return true;
    }
}