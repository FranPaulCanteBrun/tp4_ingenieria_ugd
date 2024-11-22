/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author guido
 */
public class Hijo extends Padre implements Madre, Tio, Hermano {
    private String nombre;
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, Celular celular, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.billetera = 0.0;
        this.celular = celular;
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        billetera += FORTUNA;
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de tu madre la ROSA!! Ahora tienes " + billetera + "U$S !!!");
        return NROSUERTE;
    }

    @Override
    public void heredarDinero(double money) {
        billetera += money;
        System.out.println("MSJ de tío Lucas: disfruta la herencia Addams, sumas " + billetera + " dolaritos");
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return 0; // Puede implementar la lógica de goles.
    }

    @Override
    public void cantar() {
        super.cantar();
        System.out.println("y así canta Juan Carlos");
    }

    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un " + auto.getModelo() + " de un amigo!");
    }
}
