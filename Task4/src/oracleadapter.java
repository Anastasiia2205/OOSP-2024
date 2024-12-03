public class oracleadapter implements wms {
    private oraclewms oracleWms;

    public oracleadapter(oraclewms oracleWms) {
        this.oracleWms = oracleWms;
    }

    @Override
    public String getstatus(String itemCode) {
        return oracleWms.querystock(itemCode);
    }

    @Override
    public boolean shiporder(String orderId) {
        return oracleWms.execoder(orderId);
    }
}
