import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("приветик! Это плеер!");
        System.out.println("выбери аудиоформат");
        System.out.println("1. MP3");
        System.out.println("2. AAC");
        System.out.println("3. FLAC");
        System.out.print("Тыкни на цифру (1, 2, или 3): ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("напиши название аудиофайла (песенка.mp3):");
        String fileName = scanner.nextLine();

        audcod codec = null;

        // Создаем кодек в зависимости от выбора пользователя
        switch (choice) {
            case 1:
                codec = new mp3cod();
                break;
            case 2:
                codec = new AACcod();
                break;
            case 3:
                codec = new FLACcod();
                break;
            default:
                System.out.println("Что-то пошло не так((((. Введи нужную цирфу и перезапусти прогу!");
                return;
        }

        audplayer player = new basaudplay(codec);
        player.play(fileName);

        scanner.close();
    }
}
