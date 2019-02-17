
public class Tilt {

    private int amount;
    private int price;
    private Bottle bottle;

    public Tilt(int amount){
        this.amount = amount;
    }



    public int getTiltbalance(){
        return this.amount;
    }

    public double getBill(){
        return this.amount * bottle.getPrice();
    }

}
