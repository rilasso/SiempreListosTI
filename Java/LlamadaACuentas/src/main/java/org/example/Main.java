package org.example;
import org.example.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Ricardo", "Lasso de la Vega", 8959193, 19);
        Persona persona1 = new Persona("Alberto", "Lasso de la Vega", 8959195, 17);
        Persona albert = new Persona("Albert", "Wesker", 3548373, 22);
        ArrayList<Persona> arrayList = new ArrayList();
        arrayList.add(persona);
        arrayList.add(persona1);
        arrayList.add(albert);
        Cuenta cuenta = new CuentaDeAhorro(persona);
        Cuenta cuenta2 = new CuentaCorriente(persona1, 10.02);

        for (Persona item: arrayList) {
            item.mayorDeEdad(item.Edad);
        }

        System.out.println("");

        testCuentasEspeciales();
    }

    private static void testCuentasEspeciales(){
        double montoInicial = 500;
        Scanner scannerObj = new Scanner(System.in);
        int type;
        Persona albert = new Persona("Albert", "Wesker", 3548373, 22);
// Persona william = new Persona("William", "Jenkins", "8-989-778");
        CuentaDeAhorro cuentaAhorro1 = new CuentaDeAhorro(albert, montoInicial);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(albert, montoInicial);
        System.out.println("Objetos de clases instanciados");
        System.out.println("");

        do {
            System.out.println("1. Cuenta Ahorro");
            System.out.println("2. Cuenta Corriente");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            type = scannerObj.nextByte();
            System.out.println("");
            switch (type){
                case 0:
                    System.out.println("Hasta la Proxima!\n");
                    break;
                case 1:
                    cuentaLoop(cuentaAhorro1, type);
                    break;
                case 2:
                    cuentaLoop(cuentaCorriente1, type);
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }while (type != 0);

    }

    private static void cuentaLoop(Cuenta cuenta, int tipo){
        Scanner scannerObj = new Scanner(System.in);
        int option;
        double saldo = 0.00;
        do {
            System.out.println(tipo == 1? "CUENTA AHORRO" : "CUENTA CORRIENTE");
            System.out.println("1. Ingresar Saldo");
            System.out.println("2. Retirar Saldo");
            System.out.println("3. Datos del Titular");
            System.out.println("0. Regresar");
            System.out.print("Opción: ");
            option = scannerObj.nextByte();
            System.out.println("");
            switch (option){
                case 0:
                    System.out.println("Regresando... \n");
                    break;
                case 1:
                    printSaldo(cuenta);
                    System.out.print("Saldo a ingresar: ");
                    saldo = scannerObj.nextDouble();
                    cuenta.ingresar(saldo);
                    printSaldo(cuenta);
                    System.out.println("");
                    break;
                case 2:
                    printSaldo(cuenta);
                    System.out.println("Saldo a retirar");
                    saldo = scannerObj.nextDouble();
                    cuenta.retirar(saldo);
                    printSaldo(cuenta);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Datos del Titular");
                    System.out.println(cuenta.getPersona().getName());
                    System.out.println("Ingrese cualquier valor para continuar");
                    scannerObj.next();
                    break;

                default:
                    System.out.println("Seleccione una opción valida \n");
            }
        }while (option != 0);
    }

    private static void printSaldo(Cuenta cuenta){
        System.out.println("Saldo actual= " + String.format("%.2f", cuenta.getCantidad()));

    }


}