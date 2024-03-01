import java.util.Timer;
import java.util.TimerTask;

public class TaskSchedulerExample1 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Scheduled task executed: Hello, Java!");
            }
        };

        timer.schedule(tt, 5000);
    }
}
