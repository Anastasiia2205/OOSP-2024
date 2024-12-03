import java.util.ArrayList;
import java.util.List;

public class sbj {
    private List<obsr> observers = new ArrayList<>();

    public void subscribe(obsr observer) {
        observers.add(observer);
    }

    public void unsubscribe(obsr observer) {
        observers.remove(observer);
    }

    protected void notifyObs(String eventType, String details) {
        for (obsr observer : observers) {
            observer.update(eventType, details);
        }
    }
}
