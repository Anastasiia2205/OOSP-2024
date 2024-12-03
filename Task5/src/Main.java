import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        evtTrk tracker = new evtTrk();

        // админ подписываются на уведомления
        admin admin1 = new admin("сашка");
        admin admin2 = new admin("настя");
        tracker.subscribe(admin1);
        tracker.subscribe(admin2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие :))))):");
            System.out.println("1. зарегать пользователя");
            System.out.println("2. оформить заказ");
            System.out.println("3. Выйти");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("введите имя пользователя для регистрации: ");
                    String username = scanner.nextLine();
                    tracker.userReg(username);
                    break;

                case "2":
                    System.out.print("введите имя пользователя: ");
                    String orderUsername = scanner.nextLine();
                    System.out.print("введите название товара: ");
                    String productname = scanner.nextLine();
                    tracker.item(orderUsername, productname);
                    break;

                case "3":
                    System.out.println("выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Что-то пошло не так((((. Введи нужную цирфу и перезапусти прогу!");
            }
        }
    }
}

