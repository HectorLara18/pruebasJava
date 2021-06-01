package test;

import domain.Empleado;
import domain.Person;

public class HelloWorld {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Hector", "CEO");
        Empleado empleado2 = new Empleado("Humberto", "CTO");
        System.out.println(empleado1.getEmpId());
        System.out.println(empleado2.getEmpId());
        empleado1.printEmpId();
    }
}
