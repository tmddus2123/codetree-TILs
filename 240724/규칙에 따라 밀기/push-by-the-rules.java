import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String pos = sc.next();

        for(int i=0; i<pos.length(); i++) {
            if(pos.charAt(i) == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            } else if(pos.charAt(i) == 'R') {
                str = str.substring(str.length()-1) + str.substring(0, str.length() - 1);
            }
        }
        System.out.print(str);
    }
}