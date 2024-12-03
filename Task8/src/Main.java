import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        browser browser = new browser();
        browserstat savedState = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМенююююююю:");
            System.out.println("1. Добавить закладку");
            System.out.println("2. Добавить в историю");
            System.out.println("3. Изменить настройки");
            System.out.println("4. Сохранить состояние");
            System.out.println("5. Восстановить состояние");
            System.out.println("6. Показать текущее состояние");
            System.out.println("0. Выйти");
            System.out.print("введи номер действия: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("введи URL закладки: ");
                    String bookmark = scanner.nextLine();
                    browser.addBookmark(bookmark);
                    break;

                case 2:
                    System.out.print("введи URL страницы: ");
                    String page = scanner.nextLine();
                    browser.addHistory(page);
                    break;

                case 3:
                    System.out.print("введи новые настройки: ");
                    String settings = scanner.nextLine();
                    browser.setSettings(settings);
                    break;

                case 4:
                    savedState = browser.saveState();
                    System.out.println("состояние сохранено.");
                    break;

                case 5:
                    if (savedState != null) {
                        browser.restoreState(savedState);
                        System.out.println("состояние восстановлено.");
                    } else {
                        System.out.println("сохранённое состояние отсутствует.");
                    }
                    break;

                case 6:
                    browser.showState();
                    break;

                case 0:
                    System.out.println("выход из программы.");
                    return;

                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}