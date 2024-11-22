/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author guido
 */
public class Actividad_4_Relaciones_UML {

    public static void main(String[] args) {
        // Crear objetos Auto
        Auto cascajo = new Auto("123LATA", "Renault 12");
        Auto fordFocus = new Auto("999POWR", "Ford Focus");

        // Crear objeto Celular
        Celular celular = new Celular("Movistar", "123456789", 50.0);

        // Crear objeto Padre
        Padre papa = new Padre(fordFocus);
        System.out.println("Papá me dejó esta casa en zona " + papa.getCasa().getZona());

        // Crear objeto Hijo
        Hijo juanCarlos = new Hijo("Juan Carlos", celular, cascajo);
        System.out.println("Soy el hijo Juan Carlos herede de mi padre su apellido: López");
        System.out.println("Papá me dejó este auto modelo: " + juanCarlos.getAuto().getModelo());

        // Conducir auto de un amigo
        juanCarlos.conducirAuto(fordFocus);

        // Jugar al fútbol
        juanCarlos.jugarFutbol();

        // Bailar como mamá
        juanCarlos.bailar();

        // Jugar a la lotería
        int numeroSuerte = juanCarlos.jugarLoteria();
        System.out.println("SALIO EL NUMERO DE LA SUERTE " + numeroSuerte);

        // Cantar como el padre
        juanCarlos.cantar();

        // Recibir dinero del tío
        juanCarlos.heredarDinero(2000);

        // Hacer goles
        System.out.println("Jugando al Fútbol, Hoy has hecho " + juanCarlos.hacerGoles() + " goles");
    }
}
