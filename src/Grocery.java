public class Grocery extends Product{

    Grocery(String name, int price, int weight){
        super(name, price, weight);
    }
    @Override
    public int getDiscountAmount(){
        return MagicNum.GROCERY_PROMOTION;
    }
}
