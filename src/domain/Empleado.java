package domain;

public class Empleado  extends Person{
    //Atributos
    private boolean status;
    private String department;
    private String job;
    private double salary;
    private int jobCode;
    public static int id;
    private int empId;

    //Metodos
    public Empleado(String name, String job) {
        super(name);
        this.job = job;
        ++Empleado.id;
        this.empId = Empleado.id;
    }

    //Metodos

    public int getEmpId(){
        return this.empId;
    }

    public void printEmpId() {
        System.out.println("Employeer ID: " + "900000" + this.empId);
    }
}
