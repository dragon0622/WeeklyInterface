public class Grocery extends Product implements DeliveryChargeCalculator{

    @Override
    public int getDeliveryCharge(int weight, int price) {
        return 0;
    }
}
