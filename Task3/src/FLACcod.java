public class FLACcod implements audcod {
    @Override
    public void play(String fileName) {
        System.out.println("играет FLAC : " + fileName);
    }
}
