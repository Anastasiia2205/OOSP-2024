//реализация столбчатой диаграммы
class barchart implements chart {
    private String title;
    private int[] data;

    public barchart(String title, int[] data) {
        this.title = title;
        this.data = data;
    }
    // метод клонирования
    @Override
    public chart clone() {
        return new barchart(this.title, this.data.clone());
    }

    //метод для отображения графика
    @Override
    public void display() {
        System.out.println("столбчатая диаграмма: " + title);
        for (int i = 0; i < data.length; i++) {
            System.out.print("Бар " + (i + 1) + ": ");
            for (int j = 0; j < data[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
