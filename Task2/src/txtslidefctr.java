public class txtslidefctr implements slidefctry {
    @Override
    public slide createSlide(String content) {
        return new txtslide(content);
    }
}

