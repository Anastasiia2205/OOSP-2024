public class mp3cod implements audcod {
    @Override
    public void play(String fileName) {
        System.out.println("играет mp3 " + fileName);
    }
}
