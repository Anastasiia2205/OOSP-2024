class marketplace {
    private product productService;
    private invent inventoryService;
    private order orderService;

    public marketplace() {
        this.productService = new product();
        this.inventoryService = new invent();
        this.orderService = new order();
    }

    public void addProductToMarketplace(String productName, double price, int initialStock) {
        productService.addProduct(productName, price);
        inventoryService.updateStock(productName, initialStock);
    }

    public void placeOrder(String productName, int quantity) {
        orderService.createOrder(productName, quantity);
        inventoryService.updateStock(productName, -quantity);
    }
}
