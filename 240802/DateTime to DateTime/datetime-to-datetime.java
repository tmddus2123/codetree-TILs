import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int time1 = (d * 24 + h) * 60 + m;
      
        int time2 = ((11 * 24) + 11) * 60 + 11;
        System.out.print((time2 > time1) ? -1 : time1 - time2);
    }
}