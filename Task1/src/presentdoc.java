public class presentdoc implements doc {
    @Override
    public void open() {
        System.out.println("Открыта презентация.");
    }

    @Override
    public void close() {
        System.out.println("Закрыта презентация.");
    }
}
