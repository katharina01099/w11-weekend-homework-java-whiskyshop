public class Bottle {

    private String brand;
    private SizeType size;
    private RegionType region;
    private int price;

    public Bottle(String brand, SizeType size, RegionType region, int price){
        this.brand = brand;
        this.size = size;
        this.region = region;
        this.price = price;
    }


    public String getBrand(){
        return this.brand;
    }

    public SizeType getSize(){
        return this.size;
    }

    public RegionType getRegion(){
        return this.region;
    }

    public int getPrice(){
        return this.price;
    }



}


