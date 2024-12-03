import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        marketplace marketplace = new marketplace();
        Scanner scanner = new Scanner(System.in);

        System.out.println("добро всем! это система управления торговой площадкой!");


        System.out.print("введи название товара: ");
        String productName = scanner.nextLine();

        System.out.print("веди цену товара: ");
        double price = scanner.nextDouble();

        System.out.print("введи начальное кол-во товара: ");
        int initialStock = scanner.nextInt();

        marketplace.addProductToMarketplace(productName, price, initialStock);

        scanner.close();
    }
}