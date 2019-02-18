public class Sale {


    private Bottle bottle;
    private int numberOfBottles;


    public Sale(int numberOfBottles, int price) {
        this.bottle = bottle;
        this.numberOfBottles = numberOfBottles;

    }

    public int amount(){
        return this.numberOfBottles * bottle.getPricePerBottle();
    }

}
