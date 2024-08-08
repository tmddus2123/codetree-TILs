import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] digit = sc.next().split("");
        int num = 0;
        boolean result = false;
        for(int i=0; i<digit.length; i++) {
            if(digit[i].equals("0")) {
                digit[i] = "1";
                result = true;
                break;
            }
        }
        if(!result) {
            digit[digit.length - 1] = "0";
        }
        for(int i=0; i<digit.length; i++) {
            num = num * 2 + Integer.parseInt(digit[i]) ;
        }
        System.out.print(num);
    }
}