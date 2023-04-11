package org.example;

public abstract class Cuenta {

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    private Persona persona = null;


    private double cantidad;
    public Cuenta(Persona persona, double cantidad) {
        this.persona = persona;
        this.cantidad = cantidad;
    }

    public Cuenta(Persona persona) {
        this.persona = persona;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void retirarFondos(double saldo){
        if (saldo < cantidad){
            cantidad -= saldo;
            System.out.println("Saldo de cuenta:" +cantidad);
        } else {
            System.out.println("No se pudieron retirar los fondos.");
            System.out.println("Saldo de cuenta:" +cantidad);
        }

    }

    public void ingresarFondos(double saldo){
        if(saldo > 0 ){
            cantidad += saldo;
            System.out.println("Saldo de cuenta: " +cantidad);
        }else {
            System.out.println("No se puede agregar un valor negativo");
            System.out.println("Saldo de cuenta: " +cantidad);
        }

    }

    public abstract void ingresar(double cantidad);

    public abstract void retirar(double cantidad);
}
