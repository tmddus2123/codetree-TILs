import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 0;
        for(int i=x; i<=y; i++) {
            String num = String.valueOf(i);

            int len = num.length();

            boolean result = true;
            for(int j=0; j<len; j++) {
                if(num.charAt(j) != num.charAt(len-j-1)) {
                    result = false;
                    break;
                }
            }
            if(result) {
                count++;
            }
        }
        System.out.print(count);
    }
}