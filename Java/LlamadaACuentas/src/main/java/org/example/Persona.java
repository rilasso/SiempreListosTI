package org.example;

public class Persona {

    public Persona(String name, String apellido, int cedula, int edad) {
        Name = name;
        Apellido = apellido;
        Cedula = cedula;
        Edad = edad;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        this.Cedula = cedula;
    }
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    String Name;
    String Apellido;
    int Cedula;
    int Edad;

    public boolean isME() {
        return ME;
    }

    public void setME(boolean ME) {
        this.ME = ME;
    }

    boolean ME;

    public void mayorDeEdad(int edad){
        if(edad > 18){
            //ME = true;
            System.out.println("Cuenta con la edad suficiente para crear una cuenta.");
        }else{
            //ME = false;
            System.out.println("No cuenta con la edad suficiente para crear una cuenta.");
        }

    }

}
