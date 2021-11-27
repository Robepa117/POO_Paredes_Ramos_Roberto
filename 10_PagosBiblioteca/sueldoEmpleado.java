/*
Obtener los pagos correspondientes a los trabajadores

ingresar el nombre del trabajador 
sueldo
tipo de trabajador 
*/

import javax.swing.*;
import java.util.*;

class Empleado{
    public int ID;
    public String Nombre;
    public double num_horas, sueldo_hora;

    Empleado(int ID, int num_horas, String Nombre, double sueldo_hora){
        this.ID = ID;
        this.num_horas = num_horas;
        this.Nombre = Nombre;
        this.sueldo_hora = sueldo_hora;
    }

    public void verEmpleado(){
        System.out.println("ID: " + ID + "Nombre:"  + Nombre + "Sueldo: " + sueldo_hora + "Horas de trabajo: " + num_horas + "\n");
        System.out.println();
    } 
}

class Empleados{
    public static void main(String[] args){
        int captura_ID, captura_horas, captura_opcion, posicion_empleados;
        String captura_Nombre;
        double captura_sueldo;
        boolean ciclo = true;
        Empleado[] arregloEmpleados;
        arregloEmpleados = new Empleado[5];
        Scanner leer = new Scanner(System.in);
        posicion_empleados = 0;

        while(ciclo){
            System.out.print("Seleccione la opcion deseada:"
                            + "\n 1.- Agregar nuevo empleado"
                            + "\n 2.- Consultar empleado por ID"
                            + "\n 3.- Consultar todos los empleados"
                            + "\n 4.- Pagar al empleado por ID"
                            + "\n 5.-Salir");
            captura_opcion = leer.nextInt();


        switch(captura_opcion){
            case 1:
                if(posicion_empleados < 5){
                    System.out.println("Agregar nuevo empleado");
                    System.out.println("Introduce el ID del empleado:");
                    captura_ID = leer.nextInt();
                    System.out.print("Introduce las horas trabajadas del empleado:");
                    captura_horas = leer.nextInt();
                    System.out.print("Introduce el nombre del empleado:");
                    captura_Nombre = leer.next();
                    System.out.print("Introduce el sueldo por hora del empleado");
                    captura_sueldo = leer.nextDouble();

                arregloEmpleados[posicion_empleados] = new Empleado(captura_ID, captura_horas, captura_Nombre, captura_sueldo);

                posicion_empleados++;

                }else{
                    System.out.print("Se llego al numero maximo de empleados");
                }
                break;

            case 2:

                System.out.print("Introduce el ID del empleado: ");
                captura_ID = leer.nextInt();
                buscarIdEmpleado(captura_ID, arregloEmpleados);

                break;

            case 3:

                System.out.println("Cargando la informacion de todos los empleados...");
                for(int i = 0; i < 5; i++){
                    arregloEmpleados[i].verEmpleado();
                }
                break;

            case 4:

                System.out.println("Seleccione la opcion deseada: "
                                    + "\n 1.-Pago quincenal"
                                    + "\n 2.-Pago mensual");
                captura_opcion = leer.nextInt();
                if(captura_opcion == 1){
                    for(int i = 0; i < 5; i++){
                        double sueldo_quincenal = (arregloEmpleados[i].sueldo_hora * arregloEmpleados[i].num_horas)*15.0;
                        System.out.println("El pago quincenal del empleado: " + arregloEmpleados[i].Nombre + "es de:$ " + sueldo_quincenal + "\n");
                    }

                }else{
                    for(int i = 0; i < 5; i ++){
                        double sueldo_mensual = (arregloEmpleados[i].sueldo_hora*arregloEmpleados[i].num_horas)*30.0;
                        System.out.println("El pago mensual del empleado: " + arregloEmpleados[i].Nombre + " es de:$ " + sueldo_mensual + "\n");
                    }
                }

                break;

            case 5:
                
                ciclo = false;
                break;
        }
        }
    }

    public static int buscarIdEmpleado(int ID, Empleado[] empleados){
        for(int i = 0; i < 5; i ++){
            System.out.println("El empleado es: ");
            empleados[i].verEmpleado();
        }
        return 0;
    }
}