//Конкретная реализация аудиоплеера
public class basaudplay extends audplayer {
    public basaudplay(audcod codec) {
        super(codec);
    }

    @Override
    public void play(String fileName) {
        System.out.println("включаем...");
        codec.play(fileName);
    }
}
