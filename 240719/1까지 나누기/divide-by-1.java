import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        while(true) {
            count++;
            if(n / count >= 1) {
                n /= count;
            } else {
                break;
            }
        }

        System.out.print(count);
    }
}