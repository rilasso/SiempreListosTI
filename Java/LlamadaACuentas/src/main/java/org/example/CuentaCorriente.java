package org.example;

public class CuentaCorriente extends Cuenta{
    private int movimiento = 0;
    public CuentaCorriente(Persona persona, double cantidad) {
        super(persona, cantidad);
    }

    public CuentaCorriente(Persona persona) {
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
        if(movimiento % 2 == 1){
            super.retirarFondos(cantidad);
            super.retirarFondos(cantidad * 0.03);
        } else{
            super.retirarFondos(cantidad);
        }
    }
}
