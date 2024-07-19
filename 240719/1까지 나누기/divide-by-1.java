import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        while(true) {
            if(n / count >= 1) {
                n /= count;
                count++;
            } else {
                break;
            }
        }

        System.out.print(count);
    }
}