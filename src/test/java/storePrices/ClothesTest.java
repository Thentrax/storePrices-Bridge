package storePrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothesTest {
    @Test
    void mustReturnNeutralHonorPrice(){
        Honor honor = new Neutral();
        Clothes clothes = new Clothes(100.0f);
        clothes.setHonor(honor);
        assertEquals(100.0f, clothes.calculatePrice());
    }

    @Test
    void mustReturnGoodHonorPrice(){
        Honor honor = new Good();
        Clothes clothes = new Clothes(100.0f);
        clothes.setHonor(honor);
        assertEquals(70.0f, clothes.calculatePrice());
    }

    @Test
    void mustReturnBadHonorPrice(){
        Honor honor = new Bad();
        Clothes clothes = new Clothes(100.0f);
        clothes.setHonor(honor);
        assertEquals(130.0f, clothes.calculatePrice());
    }
}