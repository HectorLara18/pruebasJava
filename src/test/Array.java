package test;

import domain.Empleado;

public class Array {
    public static void main(String[] args) {
        Empleado empleados[] = new Empleado[4];
        Empleado empleado0 = new Empleado("Hector Lara", "CEO");
        empleados[0] = empleado0;
        for(int x = 0; x < empleados.length; x++) {
            System.out.println(empleados[x]);
            if(empleados[x] != null){
                System.out.println(empleados[x].getName());
            } else {
                System.out.println("Vacio");
            }
        }
    }
}
