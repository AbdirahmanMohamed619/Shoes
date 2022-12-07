public class isBusted extends Designer {
    private boolean isBusted;
    private boolean priceIncreases;
    private boolean priceDecreases;
    private void isBusted() {
        if (isBusted == true) {
            System.out.println("Shoes are Used!");
            priceDecreases = true;
        }else{
            System.out.println("Shoes are NOT Used!");
            priceIncreases = false;
        }
    }
}