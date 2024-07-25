import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(day <= limitDay(year, month, day)) {
            if(month >= 3 && month <= 5) {
                System.out.print("Spring");
            } else if(month >= 6 && month <= 8) {
                System.out.print("Summer");
            } else if(month >= 9 && month <= 11) {
                System.out.print("Fall");
            } else {
                System.out.print("Winter");
            }
        } else {
            System.out.print(-1);
        }
    }

    public static int limitDay(int year, int month, int day) {
        if(month == 2) {
            if(isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            } 
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    public static boolean isLeapYear(int year) {
        if(year % 100 == 0 && year % 400 != 0){
            return false;
        } else if(year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}