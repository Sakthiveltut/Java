import java.util.Timer;
import java.util.TimerTask;

public class TaskSchedulerExample {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Scheduled task executed: Hello, Java!");
            }
        }, 1000);
    }
}
