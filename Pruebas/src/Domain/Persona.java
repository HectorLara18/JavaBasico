package Domain;

import java.util.Date;

public class Persona {
    //Atributos
    protected String name;
    protected int age;
    protected Date birthDate;

    //Constructor
    public Persona(){}

    public Persona(String name) {
        this.name = name;
    }

    //Metodos

    public void fechaDeNacimiento(int year, int month, int date){
        int b_year = year - 1900;
        int b_month = month - 1;
        int b_date = date;
        this.birthDate = new Date(b_year, b_month, b_date);
    }

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

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
