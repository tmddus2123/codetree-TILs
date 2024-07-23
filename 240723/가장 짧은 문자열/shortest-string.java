import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        int min = s1.length();
        int max = s1.length();
    
        for(int i=0; i<2; i++) {
            String s = sc.nextLine();
            min = Math.min(min, s.length());
            max = Math.max(max, s.length());
        }

        System.out.print(max - min);
    }
}