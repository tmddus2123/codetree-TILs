import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String answer = sc.next();

        int count = 0;
        boolean result = false;

        for(int i=0; i<str.length(); i++) {
            str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            count++;
            if(str.equals(answer)) {
                result = true;
                break;
            }
        }

        if(result) {
            System.out.print(count);
        } else {
            System.out.print(-1);
        }
    }
}