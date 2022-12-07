public class BabyShoes extends Designer 
{
    private boolean forBabies;
    private boolean isSmall;
    private boolean priceIncreases;
    private boolean priceDecreases;
    private int size;
    public void BabyShoes(){
        if (isSmall == true){
            System.out.println("Shoes aren't wearable");
            priceDecreases = true;
        }else {
            System.out.println("Shoes are wearable");
            priceIncreases = false;
        }
        if (size < 3) {
            System.out.println("Shoes are for Babies!");
        } else if (size > 3) {
            System.out.println("Shoes aren't for Babies!");
        }
    }
}
 