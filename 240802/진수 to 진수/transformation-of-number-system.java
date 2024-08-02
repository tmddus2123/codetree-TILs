import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String[] digit = sc.next().split("");
        int num = 0;
        for(int i=0; i<digit.length; i++) {
            num = num * a + Integer.parseInt(digit[i]);
        }

        int[] answer = new int[20];
        int i = 0;
        while(true) {
            if(num < b) {
                answer[i] = num;
                break;
            }
            answer[i++] = num % b;
            num /= b;
        }

        for(int j=i; j>=0; j--) {
            System.out.print(answer[j]);
        }
    }
}