public class grphslide implements slide {
    private String imagePath;

    public grphslide(String imagePath) {
        this.imagePath = imagePath;

    }

    @Override
    public void display() {
        System.out.println("графика слайдика :))): " + imagePath);
    }
}
