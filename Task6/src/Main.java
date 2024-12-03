import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип курса :))) (1-онлайн, 2-офлайн):");
        String choice = scanner.nextLine();

        cours course;
        switch (choice) {
            case "1":
                course = new onlinecour();
                break;
            case "2":
                course = new offlinecour();
                break;
            default:
                System.out.println("ошибка выбора");
                scanner.close();
                return;
        }

        course.conductClass();
        scanner.close();
    }
}