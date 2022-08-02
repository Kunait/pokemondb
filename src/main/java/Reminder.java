import java.util.Timer;

import ModelInterpreter.RemindTask;


public class Reminder {
    Timer timer;
    public RemindTask task;
    public Reminder(int seconds,RemindTask task) {
        timer = new Timer();
        this.task = task;
        timer.schedule(task, seconds*1000);
    }


}
