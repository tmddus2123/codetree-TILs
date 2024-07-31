import java.util.*;

class Message {
    String secretCode;
    String meetingPoint;
    int time;

    Message(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String point = sc.next();
        int time = sc.nextInt();

        Message m = new Message(code, point, time);
        System.out.print("secret code : " + m.secretCode + "\nmeeting point : " + m.meetingPoint +  "\ntime : " + m.time);
    }
}