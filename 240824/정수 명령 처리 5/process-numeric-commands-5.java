import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++) {
            String order = sc.next();

            if(order.equals("push_back")) {
                int n = sc.nextInt();
                list.add(n);
            } else if(order.equals("pop_back")) {
                list.remove(list.size()-1);
            } else if(order.equals("size")) {
                System.out.println(list.size());
            } else if(order.equals("get")) {
                int n = sc.nextInt();
                System.out.println(list.get(n-1));
            }
        }
    }
}