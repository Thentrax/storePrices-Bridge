package storePrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    @Test
    void mustReturnNeutralHonorPrice(){
        Honor honor = new Neutral();
        Food food = new Food(100.0f);
        food.setHonor(honor);
        assertEquals(100.0f, food.calculatePrice());
    }

    @Test
    void mustReturnGoodHonorPrice(){
        Honor honor = new Good();
        Food food = new Food(100.0f);
        food.setHonor(honor);
        assertEquals(70.0f, food.calculatePrice());
    }

    @Test
    void mustReturnBadHonorPrice(){
        Honor honor = new Bad();
        Food food = new Food(100.0f);
        food.setHonor(honor);
        assertEquals(130.0f, food.calculatePrice());
    }
}