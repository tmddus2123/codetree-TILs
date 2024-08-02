import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = sc.nextInt();

        int digit[] = new int[10];
        int i=0;
        while(true) {
            if(n < number) {
                digit[i] = n;
                break;
            }
            digit[i++] = n % number;
            n /= number;
        }

        for(int j=i; j>=0; j--) {
            System.out.print(digit[j]);
        }
    }
}