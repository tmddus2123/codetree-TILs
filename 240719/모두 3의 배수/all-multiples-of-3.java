import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;

        for(int i=0; i<5; i++) {
            int num = sc.nextInt();

            if(num % 3 != 0) {
                result = 0;
            } 
        }
        System.out.print(result);
    }
}