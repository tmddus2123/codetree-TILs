import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int cnt = 0;
        while(num < 1000) {
            if(num % 2 == 0) {
                num = num*3 + 1;
            } else {
                num = num*2 + 2;
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}