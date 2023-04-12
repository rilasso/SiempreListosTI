package org.example.dia1;

public class CuentaDeAhorro extends Cuenta {

    private int movimiento = 0;
    public CuentaDeAhorro(Persona persona, double cantidad) {
        super(persona, cantidad);
    }

    public CuentaDeAhorro(Persona persona) {
        super(persona);
    }

    @Override
    public void ingresar(double cantidad){
        movimiento++;
            super.ingresarFondos(cantidad);
    }
    @Override
    public void retirar(double cantidad){
        movimiento++;
        if(movimiento == 10){
            super.retirarFondos(cantidad);
            super.retirarFondos(cantidad * 0.1);
        } else{
            super.retirarFondos(cantidad);
        }
    }



}
