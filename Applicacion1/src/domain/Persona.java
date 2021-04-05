package domain;

public class Persona {
    //Atributos
    private String name;
    private int age;

    //Constructor

    public Persona(String name) {
        this.name = name;
    }

    //Metodos

    public String getName(){
        return  this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
