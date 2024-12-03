public class vidslidefctr implements slidefctry {
    @Override
    public slide createSlide(String content) {
        return new vidslide(content);
    }
}
