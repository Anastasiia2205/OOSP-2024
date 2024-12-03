import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        sapwms sapApi = new sapwms();
        wms sapWms = new sapadapter(sapApi);
        oraclewms oracleApi = new oraclewms();
        wms oracleWms = new oracleadapter(oracleApi);

        customwms customApi = new customwms();
        wms customWms = new customadapter(customApi);
        Scanner scanner = new Scanner(System.in);

        System.out.print("введи SKU для проверки запасов в SAP: ");
        String sapSku = scanner.nextLine();
        System.out.println(sapWms.getstatus(sapSku));

        System.out.print("введи ID заказа для отправки через SAP: ");
        String sapOrderId = scanner.nextLine();
        sapWms.shiporder(sapOrderId);

        System.out.print("введи SKU для проверки запасов в Oracle: ");
        String oracleSku = scanner.nextLine();
        System.out.println(oracleWms.getstatus(oracleSku));

        System.out.print("введи ID заказа для отправки через Oracle: ");
        String oracleOrderId = scanner.nextLine();
        oracleWms.shiporder(oracleOrderId);


        System.out.print("введи SKU для проверки запасов в Custom WMS: ");
        String customSku = scanner.nextLine();
        System.out.println(customWms.getstatus(customSku));

        System.out.print("введи ID заказа для отправки через Custom WMS: ");
        String customOrderId = scanner.nextLine();
        customWms.shiporder(customOrderId);

        scanner.close();
    }
}

