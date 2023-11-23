package storePrices;

public abstract class Product {
    protected Honor honor;
    protected float value;
    public Product(float value){
        this.value = value;
    }
    public void setHonor(Honor honor){
        this.honor = honor;
    }
    public void setValue(float value){
        this.value = value;
    }
    public abstract float calculatePrice();
}
