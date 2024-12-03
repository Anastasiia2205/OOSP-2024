//существующий api от sap
public class sapwms {
    public String fetchinven(String sku) {
    return "запасы SAP для товара: " + sku;
}
    public boolean procshipp(String order) {
        System.out.println("SAP обработал отправку для заказа " + order);
        return true;
    }
}
