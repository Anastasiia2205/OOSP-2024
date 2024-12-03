public class customwms {
    public String checkitem(String code) {
        return "запасы Custom WMS для товара: " + code;
    }

    public boolean initiateshipm(String orderReference) {
        System.out.println("Custom WMS отправил заказ: " + orderReference);
        return true;
    }
}
