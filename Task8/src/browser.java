import java.util.ArrayList;
import java.util.List;
class browser {
    private List<String> bookmarks = new ArrayList<>();
    private List<String> history = new ArrayList<>();
    private String settings = "Стандартные настройки";

    public void addBookmark(String bookmark) {
        bookmarks.add(bookmark);
    }

    public void addHistory(String page) {
        history.add(page);
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public void showState() {
        System.out.println("Закладки: " + bookmarks);
        System.out.println("История: " + history);
        System.out.println("Настройки: " + settings);
    }

    public browserstat saveState() {
        return new browserstat(bookmarks, history, settings);
    }

    public void restoreState(browserstat state) {
        this.bookmarks = state.getBookmarks();
        this.history = state.getHistory();
        this.settings = state.getSettings();
    }
}
