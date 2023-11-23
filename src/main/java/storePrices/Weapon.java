package storePrices;

public class Weapon extends Product{
    public Weapon(float price){
        super(price);
    }
    public float calculatePrice(){
        return this.value - (this.value * this.honor.discount());
    }
}
