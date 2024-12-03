public class offlinecour extends cours {
    protected void materials() { System.out.println("подготовка материалов для офлайн-курса."); }
    protected void session() { System.out.println("начало занятия в аудитории."); }
    protected void lecture() { System.out.println("проведение лекции на доске."); }
    protected void interact() { System.out.println("взаимодействие в аудитории."); }
    protected void endSes() { System.out.println("завершение занятия."); }
}
