import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split("");
        
        for(int i=str.length; i>=1 ; i--) {
            if(i%2 == 0) {
                 System.out.print(str[i - 1]);
            }
        }
    }
}