import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int result = 0;

        for(int i=0; i<str.length(); i++) {
            if(result == 0 && str.charAt(i) == 'e') {
                result++;
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}