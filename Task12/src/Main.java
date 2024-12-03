import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//базовый интерфейс
interface material {
    void display();
}

//конкретный класс для урока
class lesson implements material {
    private String title;

    public lesson(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Урок: " + title);
    }
}

//конкретный класс для задания
class assig implements material {
    private String task;

    public assig(String task) {
        this.task = task;
    }

    @Override
    public void display() {
        System.out.println("задание: " + task);
    }
}

//конкретный класс для учебника и контейнер (тут сам паттерн компоновщик)
class txtbook implements material {
    private String name;
    private List<material> contents = new ArrayList<>();

    public txtbook(String name) {
        this.name = name;
    }

    public void addContent(material material) {
        contents.add(material);
    }

    @Override
    public void display() {
        System.out.println("Учебник: " + name);
        for (material material : contents) {
            material.display();
        }
    }
}

//главный класс для демонстрации
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите название учебника: ");
        String textbookName = scanner.nextLine();
        txtbook textbook = new txtbook(textbookName);

            System.out.print("введите кол-во уроков: ");
        int numberOfLessons = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfLessons; i++) {
            System.out.print("введите название урока " + (i + 1) + ": ");
            String lessonTitle = scanner.nextLine();
            textbook.addContent(new lesson(lessonTitle));
        }
        System.out.print("введите кол-во заданий: ");
        int numberOfAssignments = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfAssignments; i++) {
            System.out.print("введите описание задания " + (i + 1) + ": ");
            String assignmentTask = scanner.nextLine();
            textbook.addContent(new assig(assignmentTask));
        }
        System.out.println("\nструктура учебных материалов:");
        textbook.display();
        scanner.close();
    }
}