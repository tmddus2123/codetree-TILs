import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        if(isExist(month, day)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isExist(int month, int day) {
        if(month <= 12) {
            if(month == 2 && day <= 28) {
                return true;
            } else if((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
                return true;
            } else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
                return true;
            }
        }
        return false;
    }
}