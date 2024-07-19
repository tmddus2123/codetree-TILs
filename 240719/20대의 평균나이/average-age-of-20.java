import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=0; 
        int sum = 0;

        while(true) {
            int age = sc.nextInt();
            if(age/10 == 2) {
                i++;
                sum+=age;
            } else {
                break;
            }
        }

        System.out.printf("%.2f", (double) sum/i);
    }
}