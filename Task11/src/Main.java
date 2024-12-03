import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос данных для создания первоначального графика
        System.out.print("введите название графика: ");
        String title = scanner.nextLine();

        System.out.print("введите количество данных (4шт) (разделенные пробелами): ");
        String[] inputData = scanner.nextLine().split(" ");
        int[] data = new int[inputData.length];
        for (int i = 0; i < inputData.length; i++) {
            data[i] = Integer.parseInt(inputData[i]);
        }

        // Создание первоначального графика
        barchart originalChart = new barchart(title, data);
        System.out.println("\nисходный график:");
        originalChart.display();

        // Клонирование графика
        chart clonedChart = originalChart.clone();
        System.out.println("\nклонированный график:");
        clonedChart.display();

        // Закрытие сканера
        scanner.close();
    }
}