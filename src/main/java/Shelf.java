import java.util.ArrayList;

public class Shelf {

    private int shelfNumber;
    private int shelfCapacity;
    public ArrayList<Bottle> bottles;

    public Shelf(int shelfNumber, int shelfCapacity){
        this.shelfNumber = shelfNumber;
        this.shelfCapacity = shelfCapacity;
        this.bottles = new ArrayList<>();

    }

    public int getShelfNumber(){

        return this.shelfNumber;
    }

    public int getShelfCapacity(){

        return this.shelfCapacity;
    }

    public int numberOfBottles(){
        return this.bottles.size();
    }

    public Boolean isFull(){
        return this.numberOfBottles() == this.shelfCapacity;
        }

    public void addBottles(Bottle bottle){
        if (!isFull()) {
            this.bottles.add(bottle);
        }

    }
}


