//абстракция для аудиоплеера
public abstract class audplayer {
    protected audcod codec; // ссылка на аудио-кодек
    public audplayer(audcod codec) {
        this.codec = codec;
    }
    public abstract void play(String fileName);
}