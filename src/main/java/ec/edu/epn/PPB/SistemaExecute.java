package ec.edu.epn.PPB;

import java.sql.SQLOutput;

public class SistemaExecute {
    public static void main(String[] args) {
        System.out.println("== Sistema Execute ==");

        Sistema sis = new Sistema();
        String membresia1 = "Anual";
        String membresia2 = "Mensual";
        String membresia3 = "Semanal";

        System.out.println(membresia1 +" -> "+sis.asignarMembresia(membresia1));
        System.out.println(membresia2 +" -> "+sis.asignarMembresia(membresia2));
        System.out.println(membresia3 +" -> "+sis.asignarMembresia(membresia3));
    }
}
