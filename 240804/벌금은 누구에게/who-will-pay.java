import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n];
        int result = -1;
        for(int i=0; i<m; i++) {
            int number = sc.nextInt();
            students[number - 1]++;
            if(students[number-1] == k) {
                result = number;
                break;
            }
        }
        System.out.print(result);
    }
}