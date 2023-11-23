package storePrices;

public class Food extends Product{
    public Food(float price){
        super(price);
    }
    public float calculatePrice(){
        return this.value - (this.value * this.honor.discount());
    }
}
