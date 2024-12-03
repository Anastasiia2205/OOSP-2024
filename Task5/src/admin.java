public class admin implements obsr {
    private String name;

    public admin(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, String details) {
        System.out.println("админ " + name + " получил уведомление: " + eventType + " - " + details);
    }
}
