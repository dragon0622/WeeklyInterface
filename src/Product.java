public class Product {
    public String name;
    public int price;
    public int weight;

    Product(String name, int price, int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public int calculateTotalFee(int price, int weight){
        if (price >= MagicNum.FREE_DELIVERY_FEE_CUT){
            return 0;
        }
        else if(price > MagicNum.DISCOUNT_DELIVERY_FEE_CUT){
            return calculateWeightFeeFirst(weight) - MagicNum.DISCOUNT_FEE;
        }
        else{
            return calculateWeightFeeFirst(weight);
        }
    }

    public int calculateWeightFeeFirst(int weight){
        if (weight >= MagicNum.OVER_WEIGHT){
            return MagicNum.OVER_WEIGHT_TAX;
        }
        else if(weight > MagicNum.LIGHT_WEIGHT_CUT){
            return MagicNum.MIDDLE_WEIGHT_TAX;
        }
        else {
            return MagicNum.LIGHT_WEIGHT_TAX;
        }
    }
}
