package org.example;

public class Warrior extends Player{
    private int fuerzaWarrior;


    public Warrior(int salud, int fuerza, int vidas, int fuerzaWarrior) {
        super(salud, fuerza, vidas);
        this.fuerzaWarrior= fuerzaWarrior;
    }

    public Warrior(int salud, int fuerza, int vidas) {
        super(salud, fuerza, vidas);
        this.fuerzaWarrior= 20;
    }

    public int getFuerzaWarrior() {
        return fuerzaWarrior;
    }

    public void setFuerzaWarrior(int fuerzaWarrior) {
        this.fuerzaWarrior = fuerzaWarrior;
    }

    public Elf convertToElf(){
        System.out.println("\uD83E\uDDEA \uD83E\uDDEA Converting your warrior ⚔\uFE0F to an elf \uD83E\uDDDD\uD83C\uDFFC");
        return new Elf(getSalud(), getFuerza(), getVidas());
    }
}
