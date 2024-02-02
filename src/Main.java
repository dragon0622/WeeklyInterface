public class Main {
    public static void main(String[] args) {

        Beauty beauty = new Beauty("화장품", 20000, 1);
        Grocery grocery1 = new Grocery("빵", 15000, 5);
        Grocery grocery2 = new Grocery("책", 45000, 15);
        LargeAppliance largeAppliance = new LargeAppliance("냉장고", 250000, 100);

        beauty.Output();
        grocery1.Output();
        grocery2.Output();
        largeAppliance.Output();

    }
}

