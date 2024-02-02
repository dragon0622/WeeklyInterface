public class Beauty extends Product implements DeliveryChargeCalculator{

    private int weight;
    private int price;

    @Override
    public int getDeliveryCharge(int weight, int price) {
        int charge = 0;
        if (weight >= 10){
            charge += 10000;
        }
        else if(weight > 3){
            charge += 5000;
        }
        else if(weight < 3){
            charge += 1000;
        }

        if (price >= 100000){
            charge = 0;
        }
        else if(weight > 30000){
            charge -= 1000;
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
