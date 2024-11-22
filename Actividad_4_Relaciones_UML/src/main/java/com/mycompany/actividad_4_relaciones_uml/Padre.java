/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author guido
 */
public class Padre {
    private String nombre;
    private String apellido;
    private Casa casa;
    private Auto auto;

    public Padre(Auto auto) {
        this.nombre = "Papá";
        this.apellido = "López";
        this.casa = new Casa("Centro. (2)pisos");
        this.auto = auto;
    }

    public void cantar() {
        System.out.println("Así canta tu padre, Don " + apellido);
    }

    public Casa getCasa() {
        return casa;
    }

    public Auto getAuto() {
        return auto;
    }
}
