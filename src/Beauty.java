public class Beauty extends Product implements DeliveryChargeCalculator{

    final int OVER_WEIGHT = 10;
    final int LIGHT_WEIGHT_CUT = 3;
    final int OVER_WEIGHT_TAX = 10000;
    final int MIDDLE_WEIGHT_TAX = 5000;
    final int LIGHT_WEIGHT_TAX = 1000;

    final int FREE_DELIVERY_PEE_CUT = 100000;
    final int DISCOUNT_DELIVERY_PEE_CUT = 30000;
    final int DISCOUNT_PEE = 1000;

    private int weight;
    private int price;



    @Override
    public int getDeliveryCharge(int weight, int price) {
        int charge = 0;
        if (weight >= OVER_WEIGHT){
            charge += OVER_WEIGHT_TAX;
        }
        else if(weight > LIGHT_WEIGHT_CUT){
            charge += MIDDLE_WEIGHT_TAX;
        }
        else if(weight < LIGHT_WEIGHT_CUT){
            charge += LIGHT_WEIGHT_TAX;
        }


        if (price >= FREE_DELIVERY_PEE_CUT){
            charge = 0;
        }
        else if(weight > DISCOUNT_DELIVERY_PEE_CUT){
            charge -= DISCOUNT_PEE;
        }
        return charge;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int Price){
        this.price = price;
    }
}
