public class Grocery extends Product implements DeliveryChargeCalculator{

    Grocery(String name, int price, int weight){
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(int price, int weight) {
        return calculateTotalFee(price,weight);
    }

    public void Output(){
        int DeliveryFee = getDeliveryCharge(this.price, this.weight);
        System.out.println(this.name + "의 배송료는" + DeliveryFee + "원 입니다."
                + "총 가격은" + (DeliveryFee + this.price) + "원 입니다.");
    }
}
