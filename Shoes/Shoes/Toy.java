public class Toy extends Designer {
    private boolean isToy;
    private boolean isBroken;
    private String onSale;
    private void Toy() {
        if (isToy) {
            System.out.println("Shoes are for toy!");
        }
        if (isBroken) {
            System.out.println("Shoes aren't usable for toy!");
            System.out.println(onSale);
        }
    }
}