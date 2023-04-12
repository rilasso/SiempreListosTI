package org.example.dia2;

public class Riesgo {



    public enum CalificacionDeRiesgo {AAA, AA, A, BBB, BB, B, C, D, F};

    private int edad;
    private CalificacionDeRiesgo clasificacion;
    public Riesgo(int edad, CalificacionDeRiesgo clasificacion){
        this.edad = edad;
        this.clasificacion = clasificacion;
    }

    public void imprimir(){
        System.out.println(edad + " - "+ clasificacion.toString().toLowerCase());
    }
    public static void main(String[] args) {
        Riesgo riesgo = new Riesgo(25, Riesgo.CalificacionDeRiesgo.AA );
        riesgo.imprimir();
    }

}
