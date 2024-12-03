public class oraclewms {
    public String querystock(String productCode) {
    return "запасы Oracle для товара : " + productCode;
}

    public boolean execoder(String orderId) {
        System.out.println("Oracle обработал отправку для заказа: " + orderId);
        return true;
    }
}
