import java.util.*;

public class Main {
    public static int[] endDay = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String searchDay = sc.next();
        int search = 0;
        switch(searchDay) {
            case "Mon":
                search = 0;
                break;
            case "Tue":
                search = 1;
                break;
            case "Wed":
                search = 2;
                break;
            case "Thu":
                search = 3;
                break;
            case "Fri":
                search = 4;
                break;
            case "Sat":
                search = 5;
                break;
            case "Sun":
                search = 6;
                break;
        }

        for(int i=0; i<m1; i++) {
            d1 += endDay[i];
        }

        for(int i=0; i<m2; i++) {
            d2 += endDay[i];            
        }

        int count = 0;
        for(int i=0; i<=d2 - d1; i++) {
            if(i % 7 == search) {
                count++;
            }
        }
        System.out.print(count);
    }
}