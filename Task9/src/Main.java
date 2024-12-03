import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        notify notificationService = notify.getInstance();

        while (true) {
            System.out.print("введите смс для уведомления (или 'выход' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("выход")) {
                System.out.println("завершение программы.");
                break;
            }
            notificationService.sendNotification(input);
        }
    }
}