package org.example;

public class Elf extends Player{
    private int velocidad;


    public Elf(int salud, int fuerza, int vidas, int velocidad) {
        super(salud, fuerza, vidas);
        this.velocidad = velocidad;
    }

    public Elf(int salud, int fuerza, int vidas) {
        super(salud, fuerza, vidas);
        this.velocidad= 10;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
