package org.example.dia1;
import org.example.dia2.Riesgo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Persona persona = new Persona("Ricardo", "Lasso de la Vega", 8959193, 19);
    static Persona persona1 = new Persona("Ricardo", "Lasso de la Vega", 8959195, 17);
    static Persona albert = new Persona("Albert", "Wesker", 3548373, 22);
    static Persona sinCuenta = new Persona("Prueba", "Prueba", 1231412, 20);

    public static void main(String[] args) {
        ArrayList<Persona> arrayList = new ArrayList();
        arrayList.add(persona);
        arrayList.add(persona1);
        arrayList.add(albert);

        for (Persona item: arrayList) {
            item.mayorDeEdad(item.Edad);

            if(item.ME){
                if(!item.cuentaDeAhorraEx){
                    System.out.println("No tiene una cuenta de ahorro. Abra una cuenta y vuelva a intentar.");
                }

                printing(item);
                Scanner dinero = new Scanner(System.in);
                double plata = dinero.nextDouble();
                Cuenta cuenta = new CuentaDeAhorro(item, plata);

                if(cuenta.getCantidad() >= 999 && cuenta.getCantidad() <= 1998){
                    item.setCalificacionDeRiesgo(Riesgo.CalificacionDeRiesgo.AA);
                    System.out.println(item.getCalificacionDeRiesgo()+" "+item.Name + " "+ item.Apellido);

                }else if(cuenta.getCantidad() >= 1999){
                    item.setCalificacionDeRiesgo(Riesgo.CalificacionDeRiesgo.AAA);
                    System.out.println(item.getCalificacionDeRiesgo()+" "+item.Name + " "+ item.Apellido);

                }else {
                    System.out.println(item.getCalificacionDeRiesgo()+" "+item.Name + " "+ item.Apellido);
                }
                if(item.getCalificacionDeRiesgo() == Riesgo.CalificacionDeRiesgo.AA){
                    if(item.cuentaDeAhorraEx){
                        cuentaCorrienteAprobada(item);
                    }
                }else if(item.getCalificacionDeRiesgo() == Riesgo.CalificacionDeRiesgo.AAA){
                    if(item.cuentaDeAhorraEx){
                        cuentaCorrienteAprobada(item);
                    }

                }else{
                    if(!item.cuentaDeAhorraEx){
                        System.out.println("En estos momentos no cuenta con los requisitos necesarios para abrir una cuenta.");
                    }
                }
            }else {
                if(item.cuentaDeAhorraEx){
                    cuentaCorrienteAprobada(item);
                    item.setCalificacionDeRiesgo(Riesgo.CalificacionDeRiesgo.C);
                    System.out.println(item.getCalificacionDeRiesgo()+" "+item.Name + " "+ item.Apellido);
                    System.out.println("Es un menor de edad. No puede abrir una cuenta corriente.");
                }
            }
        }
        System.out.println();

        testCuentasEspeciales();
    }

    private static void testCuentasEspeciales(){
        double montoInicial = 500;
        Scanner scannerObj = new Scanner(System.in);
        int type;
        //Persona albert = new Persona("Albert", "Wesker", 3548373, 22);
// Persona william = new Persona("William", "Jenkins", "8-989-778");
        CuentaDeAhorro cuentaAhorro1 = new CuentaDeAhorro(persona, montoInicial);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(persona1, montoInicial);
        System.out.println("Objetos de clases instanciados");
        System.out.println();

        do {
            System.out.println("1. Cuenta Ahorro");
            System.out.println("2. Cuenta Corriente");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            type = scannerObj.nextByte();
            System.out.println();
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
        Scanner objeto = new Scanner(System.in);
        int option;
        double saldo = 0.00;
        do {
            System.out.println(tipo == 1? "CUENTA AHORRO" : "CUENTA CORRIENTE");
            System.out.println("1. Ingresar Saldo");
            System.out.println("2. Retirar Saldo");
            System.out.println("3. Datos del Titular");
            System.out.println("0. Regresar");
            System.out.print("Opción: ");
            option = objeto.nextInt();
            System.out.println();
            switch (option){
                case 0:
                    System.out.println("Regresando... \n");
                    break;
                case 1:
                    printSaldo(cuenta);
                    System.out.print("Saldo a ingresar: ");
                    saldo = objeto.nextDouble();
                    cuenta.ingresar(saldo);
                    printSaldo(cuenta);
                    System.out.println("");
                    break;
                case 2:
                    printSaldo(cuenta);
                    System.out.println("Saldo a retirar");
                    saldo = objeto.nextDouble();
                    cuenta.retirar(saldo);
                    printSaldo(cuenta);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Datos del Titular");
                    System.out.println("Nombre: " + cuenta.getPersona().getName() + " " + cuenta.getPersona().getApellido());
                    System.out.println("Saldo de la cuenta actual: " + cuenta.getCantidad());
                    System.out.println("Ingrese cualquier valor para continuar");
                    objeto.next();
                    break;

                default:
                    System.out.println("Seleccione una opción valida \n");
            }
        }while (option != 0);
    }

    private static void cuentaCorrienteAprobada(Persona item){
        System.out.println("Puede abrir una Cuenta Corriente");
        System.out.println("Deseas abrir una cuenta corriente?");
        String respuesta;
        double plata;
        Scanner resp = new Scanner(System.in);
        Scanner dinero = new Scanner(System.in);
        respuesta = resp.next().toLowerCase();
        if(respuesta.equals("si")){
            System.out.println("Cuanto dinero desea tener en la cuenta?");
            plata = dinero.nextDouble();
            Cuenta cuenta1 = new CuentaCorriente(item, plata);
            System.out.println("Esta es la cantidad de dinero que puedes retirar de tu cuenta corriente: " + cuenta1.getCantidad());
        }else {
            System.out.println("Decidio no abrir la cuenta en este momento.");
        }
    }
    private static void printing(Persona item) {
        item.setCalificacionDeRiesgo(Riesgo.CalificacionDeRiesgo.B);
        System.out.println(item.getCalificacionDeRiesgo()+" "+item.Name + " "+ item.Apellido);
        System.out.println("Cuanto dinero meteras a la cuenta? ");
    }
    private static void printSaldo(Cuenta cuenta){
        System.out.println("Saldo actual= " + String.format("%.2f", cuenta.getCantidad()));
    }


}