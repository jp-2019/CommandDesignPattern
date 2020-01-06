public class TheCustomer {
    public static void main(String[] args) {
        Stock saddle = new Stock();

        BuyStock buyStock = new BuyStock(saddle);
        SellStock sellStock = new SellStock(saddle);

        TheBroker theBroker = new TheBroker();

        theBroker.takeOrder(buyStock);
        theBroker.takeOrder(sellStock);
        theBroker.placeOrders();
    }
}
