public class sapadapter implements wms {
    private sapwms sapWms;

    public sapadapter(sapwms sapWms) {
        this.sapWms = sapWms;
    }

    @Override
    public String getstatus(String itemCode) {
        return sapWms.fetchinven(itemCode);
    }

    @Override
    public boolean shiporder(String orderId) {
        return sapWms.procshipp(orderId);
    }
}
