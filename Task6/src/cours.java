public abstract class cours {
    //шаблонный метод
    public final void conductClass() {
        materials();
        session();
        lecture();
        interact();
        endSes();
    }
//а это абстрактные уже
    protected abstract void materials();
    protected abstract void session();
    protected abstract void lecture();
    protected abstract void interact();
    protected abstract void endSes();
}
