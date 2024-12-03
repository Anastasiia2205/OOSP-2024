import java.util.ArrayList;
import java.util.List;

// Класс для хранения состояния браузера (Снимок)
class browserstat {
    private final List<String> bookmarks;
    private final List<String> history;
    private final String settings;

    public browserstat(List<String> bookmarks, List<String> history, String settings) {
        this.bookmarks = new ArrayList<>(bookmarks);
        this.history = new ArrayList<>(history);
        this.settings = settings;
    }

    public List<String> getBookmarks() {
        return new ArrayList<>(bookmarks);
    }

    public List<String> getHistory() {
        return new ArrayList<>(history);
    }

    public String getSettings() {
        return settings;
    }
}