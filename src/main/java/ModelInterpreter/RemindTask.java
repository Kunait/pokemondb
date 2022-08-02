package ModelInterpreter;

import java.util.TimerTask;

public abstract class RemindTask extends TimerTask {
    @Override
    public abstract void run();
}
