package domain;

public class Person {
    //Atributos
    protected String name;
    protected int age;
    protected char genero;

    //Constructor
    public Person(String name) {
        this.name = name;
    }

    //Metodos


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
