import java.util.Scanner;

public class docapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип документа (text, spreadsheet, presentation):");
        String type = scanner.nextLine();

        try {
            // Создаём документ через фабрику
            doc document = docfactory.createDocument(type);

            // Работаем с документом
            document.open();
            System.out.println("Выполняются операции с документом...");
            document.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

