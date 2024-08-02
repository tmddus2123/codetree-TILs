import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] digit = new int[20];
        int i=0;

        while(true) {
            if(num < 2) {
                digit[i] = num;
                break;
            }
            digit[i] = num%2;
            num /= 2;
            i++;
        }

        for(int j=i; j>=0; j--) {
            System.out.print(digit[j]);
        }
    }
}