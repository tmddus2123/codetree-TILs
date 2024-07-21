import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = 0;
        for(int i=1; i<=num; i++) {
            for(int j=0; j<num; j++) {
                if(i % 2 == 1) {
                    result++;
                } else {
                    result += 2;
                }
                System.out.print(result + " ");
            }
            System.out.print("\n");
        }
    }
}