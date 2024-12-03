public class vidslide implements slide {
    private String videoPath;

    public vidslide(String videoPath) {
        this.videoPath = videoPath;
    }

    @Override
    public void display() {
        System.out.println("видео слайдика :): " + videoPath);
    }
}