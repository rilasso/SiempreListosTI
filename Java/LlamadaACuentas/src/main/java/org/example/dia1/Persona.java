package org.example.dia1;
import org.example.dia2.Riesgo;

public class Persona {

    public Persona(String name, String apellido, int cedula, int edad) {
        Name = name;
        Apellido = apellido;
        Cedula = cedula;
        Edad = edad;
    }


    public Riesgo.CalificacionDeRiesgo getCalificacionDeRiesgo() {
        return calificacionDeRiesgo;
    }

    public void setCalificacionDeRiesgo(Riesgo.CalificacionDeRiesgo calificacionDeRiesgo) {
        this.calificacionDeRiesgo = calificacionDeRiesgo;
    }

    public Persona(Riesgo.CalificacionDeRiesgo calificacionDeRiesgo, String name, String apellido, int cedula, int edad) {
        this.calificacionDeRiesgo = calificacionDeRiesgo;
        Name = name;
        Apellido = apellido;
        Cedula = cedula;
        Edad = edad;
    }

    private Riesgo.CalificacionDeRiesgo calificacionDeRiesgo;


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

    public boolean isCuentaDeAhorraEx() {
        return cuentaDeAhorraEx;
    }

    public void setCuentaDeAhorraEx(boolean cuentaDeAhorraEx) {
        this.cuentaDeAhorraEx = cuentaDeAhorraEx;
    }

    boolean cuentaDeAhorraEx = false;



    public boolean isME() {
        return ME;
    }

    public void setME(boolean ME) {
        this.ME = ME;
    }

    boolean ME;

    public void mayorDeEdad(int edad){
        if(edad > 18){
            ME = true;

        }else{
            ME = false;

        }

    }

}
