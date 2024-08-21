import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 0;
        for(int i=x; i<=y; i++) {
            String[] arr = String.valueOf(i).split("");

            int len = arr.length;

            boolean result = true;
            for(int j=0; j<len; j++) {
                if(!arr[j].equals(arr[len-j-1])) {
                    result = false;
                    break;
                }
            }
            if(result) {
                count++;
            }
        }
        System.out.print(count);
    }
}