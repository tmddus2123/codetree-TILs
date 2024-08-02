import java.util.*;

public class Main {

    public static int[] endDay = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        for(int i=1; i<m1; i++) {
            d1 += endDay[i];
        }
        int mon = d1 % 7;

        for(int i=0; i<m2; i++) {
            d2 += endDay[i];
        }

        int day2 = d2 % 7;
        int diff = day2 - mon;

        diff = (diff < 0) ? diff + 7 : diff;
        String day = "";
        if(diff == 0) {
            day = "Mon";
        } else if(diff == 1) {
            day = "Tue";
        } else if(diff == 2) {
            day = "Wed";
        } else if(diff == 3) {
            day = "Thu";
        } else if(diff == 4) {
            day = "Fri";
        } else if(diff == 5) {
            day = "Sat";
        } else {
            day = "Sun";
        }

        System.out.print(day);
    }
}