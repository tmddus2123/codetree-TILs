import java.util.*;

class Data{
    int element, number, pos;
    
    public Data(int element, int number) {
        this.element = element;
        this.number = number;
    }
}


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        Data[] d = new Data[num];

        for(int i=0; i<num; i++) {
            int el = sc.nextInt();

            d[i] = new Data(el, i+1);
        }

        Arrays.sort(d, new Comparator<Data>() {
            @Override
            public int compare(Data a, Data b) {
                return a.element - b.element;
            }
        });

        for(int i=0; i<num; i++) {
            arr[d[i].number - 1] = i+1;
        }

        for(int a : arr) {
            System.out.print(a + " ");
        } 
    }
}