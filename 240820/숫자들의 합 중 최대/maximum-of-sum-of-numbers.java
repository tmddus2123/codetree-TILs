import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = 0;
        for(int i=x; i<=y; i++) {
            int sum = 0;
            int num = i;
            while(true) {
                if(num < 10) {
                    sum += num;
                    break;
                }
                sum += (num % 10);
                num = num/10;
            }
            if(max < sum) {
                max = sum;
            }
        }
        System.out.print(max);
    }
}