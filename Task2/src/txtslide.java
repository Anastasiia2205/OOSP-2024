public class txtslide implements slide{
    private String text;

    public txtslide(String text) {
        this.text = text;
}
    @Override
    public void display() {
        System.out.println("текстик слайдика :): " + text);
    }
}