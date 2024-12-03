import java.util.Scanner;

public class presentAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("привет!");
        System.out.println("выберите тип слайда:");
        System.out.println("1. текстик");
        System.out.println("2. графика");
        System.out.println("3. видео");
        System.out.print("Тыкни на цифру (1, 2, или 3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); //остаток строки после числа

        slide slide = null;

        //слайд в зависимости от выбора пользователя
        switch (choice) {
            case 1:
                System.out.print("напиши текст для слайда: ");
                String text = scanner.nextLine();
                slidefctry txtfctr = new txtslidefctr();
                slide = txtfctr.createSlide(text);
                break;
            case 2:
                System.out.print("напиши путь к изображению для граф слайда: ");
                String imagePath = scanner.nextLine();
                slidefctry grphfctr = new grphslidefctr();
                slide = grphfctr.createSlide(imagePath);
                break;
            case 3:
                System.out.print("напиши путь к видео для слайда: ");
                String videoPath = scanner.nextLine();
                slidefctry vidfctr = new vidslidefctr();
                slide = vidfctr.createSlide(videoPath);
                break;
            default:
                System.out.println("Что-то пошло не так((((. Введи нужную цирфу и перезапусти прогу!");
                return;
        }
                if (slide != null) {
            System.out.println("\nслайд успешно создан");
            slide.display();
        }

        scanner.close();
    }
}