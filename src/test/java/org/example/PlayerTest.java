package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    @DisplayName("Testing Warrior.converToElf()")
    void Warrior_convertToElf_Ok() {
        Warrior warrior1 = new Warrior (100,30,3);
        Elf elf1 = warrior1.convertToElf();

        Assertions.assertEquals(warrior1.getSalud(), elf1.getSalud());
        Assertions.assertEquals(warrior1.getFuerza(), elf1.getFuerza());
        Assertions.assertEquals(warrior1.getVidas(), elf1.getVidas());
        System.out.println("Warrior converted to Elf Successfully");
    }

    @Test
    @DisplayName("Testing Wizard.converToElf()")
    void Wizard_convertToElf_Ok() {
        Wizard wizard1 = new Wizard (80,10,2);
        Elf elf1 = wizard1.convertToElf();

        Assertions.assertEquals(80, elf1.getSalud());
        Assertions.assertEquals(10, elf1.getFuerza());
        Assertions.assertEquals(2, elf1.getVidas());
        System.out.println("Wizard converted to Elf Successfully");
    }

    @Test
    @DisplayName("Testing decrementLive() 0 vidas")
    void decrementLife_0Lives() {
        Wizard wizard1 = new Wizard (20,10,0);
        Wizard wizard2 = new Wizard (20,10,1);
        wizard1.decrementLive();
        wizard2.decrementLive();

        Assertions.assertEquals(0, wizard1.getSalud());

        System.out.println("decrementLive() con 0 vidas Successfull");
    }

    @Test
    @DisplayName("Testing decrementLife() mas de 0 vidas")
    void decrementLife_moreThan0Lives() {
        Wizard wizard1 = new Wizard (20,10,2);
        wizard1.decrementLive();

        Assertions.assertEquals(100, wizard1.getSalud());
        System.out.println("decrementLive() con mas de 0 vidas Successfull");
    }

    @Test
    @DisplayName("Testing checkHealth() salud mayor que 0 y mas de 0 vidas")
    void checkHealth_moreThan0Lives_moreThan0Health() {
        Wizard wizard1 = new Wizard (20,10,1);
        wizard1.checkHealth();

        Assertions.assertEquals(20, wizard1.getSalud());
        Assertions.assertTrue(wizard1.getVidas() > 0);
        System.out.println("checkHealth() Successfull");
    }

    @Test
    @DisplayName("Testing checkHealth() salud menor o igual a 0")
    void checkHealth_lessThan0Health() {
        Wizard wizard1 = new Wizard (0,10,1);
        wizard1.checkHealth();

        Assertions.assertEquals(0, wizard1.getVidas());
        System.out.println("checkHealth() Successfull");
    }

    @Test
    @DisplayName("Testing checkHealth() vidas igual a 0")
    void checkHealth_0Lives() {
        Wizard wizard1 = new Wizard (50,10,0);
        wizard1.checkHealth();

        Assertions.assertEquals(0, wizard1.getVidas());
        Assertions.assertTrue(wizard1.checkHealth() == 0);
        System.out.println("checkHealth() Successfull");
    }

    @Test
    @DisplayName("Testing attack() playerToAttack esta muerto")
    void attack_playerToAttack_0Lives() {
        Wizard wizard1 = new Wizard (50,10,0);
        Warrior warrior1 = new Warrior (90,30,3);
        warrior1.attack(wizard1);

        Assertions.assertEquals(0, wizard1.getVidas());
        Assertions.assertTrue(wizard1.checkHealth() == 0);
        System.out.println("attack() Successfull");
    }

    @Test
    @DisplayName("Testing attack() playerToAttack recibe daño")
    void attack_playerToAttack_getDamage() {
        Wizard wizard1 = new Wizard (50,10,3);
        Warrior warrior1 = new Warrior (90,30,3);
        warrior1.attack(wizard1);

        Assertions.assertEquals(20, wizard1.getSalud());
        Assertions.assertTrue(wizard1.getVidas() == 3);
        System.out.println("attack() Successfull");
    }

    @Test
    @DisplayName("Testing attack() playerToAttack pierde una vida")
    void attack_playerToAttack_LossesALive() {
        Wizard wizard1 = new Wizard (20,10,2);
        Warrior warrior1 = new Warrior (90,30,3);
        warrior1.attack(wizard1);

        Assertions.assertEquals(1, wizard1.getVidas());
        Assertions.assertTrue(wizard1.checkHealth() == 100);
        System.out.println("attack() Successfull");
    }


}
