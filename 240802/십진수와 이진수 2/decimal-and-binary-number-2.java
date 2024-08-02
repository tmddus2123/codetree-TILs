import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] digit = sc.next().split("");

        int num = 0;
        for(int i=0; i<digit.length; i++) {
            num = num * 2 + Integer.parseInt(digit[i]);
        }
        num *= 17;

        int[] newDigit = new int[20];
        int i=0;
        while(true) {
            if(num < 2) {
                newDigit[i] = num;
                break;
            }
            newDigit[i++] = num % 2;
            num /= 2;
        }
        for(int j=i; j>=0; j--) {
            System.out.print(newDigit[j]);
        }
    }
}