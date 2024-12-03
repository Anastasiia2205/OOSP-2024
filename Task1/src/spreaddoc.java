public class spreaddoc implements doc {
    @Override
    public void open() {
        System.out.println("Открыта таблица.");
    }

    @Override
    public void close() {
        System.out.println("Закрыта таблица.");
    }
}