public class textdoc implements doc {
    @Override
    public void open() {
        System.out.println("Открыт текстовый документ.");
    }

    @Override
    public void close() {
        System.out.println("Закрыт текстовый документ.");
    }
}
