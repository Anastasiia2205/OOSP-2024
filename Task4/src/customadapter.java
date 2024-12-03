public class customadapter implements wms {
    private customwms customWms;

    public customadapter(customwms customWms) {
        this.customWms = customWms;
    }

    @Override
    public String getstatus(String itemCode) {
        return customWms.checkitem(itemCode);
    }

    @Override
    public boolean shiporder(String orderId) {
        return customWms.initiateshipm(orderId);
    }
}
