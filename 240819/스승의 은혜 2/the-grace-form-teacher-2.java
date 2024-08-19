import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int budget = sc.nextInt();

        int[] price = new int[num];

        for(int i=0; i<num; i++) {
            price[i] = sc.nextInt();
        }

        Arrays.sort(price);

        int max = 0;
        for(int i=0; i<num; i++) {
            if(price[i]/2 > budget) {
                continue;
            }
            int sum = price[i] / 2;
            int count = 1;
            for(int j=0; j<num; j++) {
                if(i == j) {
                    continue;
                }

                if(sum + price[j] <= budget) {
                    sum += price[j];
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.print(max);
    }
}