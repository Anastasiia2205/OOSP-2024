import java.util.Scanner;
class notify {
        private static notify instance;

        private notify() {
    }
    // Метод для получения единственного экземпляра
    public static notify getInstance() {
        if (instance == null) {
            instance = new notify();
        }
        return instance;
    }
    public void sendNotification(String message) {
        System.out.println("уведомление: " + message);
    }
}
