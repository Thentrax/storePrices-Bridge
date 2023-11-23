package storePrices;

public class Clothes extends Product{
    public Clothes(float price){
        super(price);
    }
    public float calculatePrice(){
        return this.value - (this.value * this.honor.discount());
    }
}
