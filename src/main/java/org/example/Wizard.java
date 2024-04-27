package org.example;

public class Wizard extends Player{
    private int spell;

    public Wizard(int salud, int fuerza, int vidas, int spell) {
        super(salud, fuerza, vidas);
        this.spell  = spell;
    }

    public Wizard(int salud, int fuerza, int vidas) {
        super(salud, fuerza, vidas);
        this.spell  = 5;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf(){
        System.out.println("\uD83E\uDDEA \uD83E\uDDEA Converting your wizard ⚔\uD83E\uDDD9 to an elf \uD83E\uDDDD\uD83C\uDFFC");
        return new Elf(getSalud(), getFuerza(), getVidas());
    }
}
