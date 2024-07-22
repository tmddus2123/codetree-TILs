import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char result = 'A';

        for(int i=0; i<num; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("  ");
            }
            for(int j=0; j<num - i; j++) {
                System.out.print(result + " ");
                result++;
            }
            System.out.print("\n");
        }
    }
}