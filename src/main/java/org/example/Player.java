package org.example;

public class Player {
    private int saludOriginal =100;
    private int salud;
    private int fuerza;
    private int vidas;

    public Player(int salud, int fuerza, int vidas) {
        this.salud = salud;
        this.fuerza = fuerza;
        this.vidas = vidas;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void decrementLive(){
        vidas--;
        if (vidas > 0){
            salud = saludOriginal;
            System.out.println("Te quedan "+vidas+ " vidas");

        } else {
            salud =0;
            System.out.println("Este personaje esta muerto");
        }
    }
    public void attack (Player playerToAttack){
        if (playerToAttack.getVidas() > 0) {
            // this.getStrength() will be the actual/current player
            playerToAttack.setSalud(playerToAttack.getSalud()-this.getFuerza());
            System.out.println("el jugador "+this+ " ataca a jugador "+playerToAttack+" que recibe "+this.getFuerza()+" puntos de daño");
            playerToAttack.checkHealth();
        } else {
            System.out.println("El personaje esta muerto, no se le puede atacar");
        }
    }

    public int checkHealth(){
        if (salud <= 0 && vidas > 0){
            decrementLive();
        }else if (vidas == 0){
            salud = 0;
            System.out.println("Este personaje esta muerto");
        }
        System.out.println("Salud actual: "+getSalud());
        return getSalud();
    }
}
