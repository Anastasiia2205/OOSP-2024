public class grphslidefctr implements slidefctry {
    @Override
    public slide createSlide(String content) {
        return new grphslide(content);
    }
}
