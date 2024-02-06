public class Calculator {
    public static int getDeliveryCharge(double weight, int price){
        int baseDeliveryCharge = getBaseDeliveryCharge(weight);

        if (price < MagicNum.DISCOUNT_DELIVERY_FEE_CUT){
            return baseDeliveryCharge;
        }
        else if (price < MagicNum.FREE_DELIVERY_FEE_CUT){
            return baseDeliveryCharge - MagicNum.DISCOUNT_FEE;
        }
        return 0;
    }

    private static int getBaseDeliveryCharge(double weight){
        int deliveryCharge;
        if (weight < MagicNum.LIGHT_WEIGHT_CUT){
            deliveryCharge = MagicNum.LIGHT_WEIGHT_TAX;
        }
        else if (weight < MagicNum.OVER_WEIGHT){
            deliveryCharge = MagicNum.MIDDLE_WEIGHT_TAX;
        }
        else{
            deliveryCharge = MagicNum.OVER_WEIGHT_TAX;
        }
        return deliveryCharge;
    }

}
