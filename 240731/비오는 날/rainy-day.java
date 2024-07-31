import java.util.*;

class Weather {
    String date;
    String day;
    String data;

    public Weather(String date, String day, String data) {
        this.date = date;
        this.day = day;
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Weather[] w = new Weather[num];

        for(int i=0; i<num; i++) {
            String date = sc.next();
            String day = sc.next();
            String data = sc.next();

            w[i] = new Weather(date, day, data);
        }

        int last = 0;
        for(int i=1; i<num; i++) {
            if(!w[last].data.equals("Rain")) {
                last++;
                continue;
            }

            if(w[i].data.equals("Rain") && w[i].date.compareTo(w[last].date) < 0) {
                last = i;
            }
        }
        System.out.print(w[last].date + " " + w[last].day + " " + w[last].data);
    }
}