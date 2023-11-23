package storePrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    void mustReturnNeutralHonorPrice(){
        Honor honor = new Neutral();
        Weapon weapon = new Weapon(100.0f);
        weapon.setHonor(honor);
        assertEquals(100.0f, weapon.calculatePrice());
    }

    @Test
    void mustReturnGoodHonorPrice(){
        Honor honor = new Good();
        Weapon weapon = new Weapon(100.0f);
        weapon.setHonor(honor);
        assertEquals(70.0f, weapon.calculatePrice());
    }

    @Test
    void mustReturnBadHonorPrice(){
        Honor honor = new Bad();
        Weapon weapon = new Weapon(100.0f);
        weapon.setHonor(honor);
        assertEquals(130.0f, weapon.calculatePrice());
    }

}