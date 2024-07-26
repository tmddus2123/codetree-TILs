import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(charNumber(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean charNumber(String str) {
        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            if(arr[str.charAt(i) - 'a'] == 0) {
                arr[str.charAt(i) - 'a'] = 1;
            }
        }

        int total = 0;
        for(int i=0; i<arr.length; i++) {
            total += arr[i];
        }

        if(total >= 2) {
            return true;
        } else {
            return false;
        }
    }
}