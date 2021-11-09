/*
Vamos a crear un programa que se encargue a realizar las siguientes operaciones

1.- Bono o descuento
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas a celcius, Kelvin y Rankine
4.- Numero de positivos y negativos segun una lista de numeros
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial 
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigo
12.- Diamante de codigo 
13.- Calculadora
14.- Salir ¿


*/

import java.util.Scanner;

class EstructuraDeDatos{

    //Programa 1
    /*
    El programa debe solicitar la edad del usuario. Si esta es mayor de 65,
    al precio  del abono se le aplica un descuento del 40%.
    si la edad es menor que 21, se pregunta al usuario si sus padres son 
    socios. si la respuesta es afirmativa, se les aplica un descuento del
    45%; en caso contrario, se les aplica un 25%.

    variable Edad
    condiciones 
    */

public static void main(String[] args){

    //objetos
    Scanner entrada = new Scanner(System.in);
    //Scanner letras = new Scanner(System.in);
    
    
    //variables
    int Edad, opcion, Socio, numbinario;
    double Precio, Bono;
    char Letras;
    String binario = "";
    
    
    //cuerpo del programa
    
    //menu de las opciones de arriba
    
    do{
    
    System.out.println("Bienvenido a tu primer programa de estructura.");
    System.out.println("Por favor elija la opcion deseada");
    System.out.println("1.-Descuento pr la edad");
    System.out.println("2.-Convertir numero decimal a bianrio");
    System.out.println("3.-Conversiones de temperatura");
    System.out.println("4.-Numeros positivos y negativos");
    System.out.println("5.-Tienda");
    System.out.println("6.-Area y Perimetros");
    System.out.println("7.-Tabla");
    System.out.println("8.-Factorial");
    System.out.println("9.-Dibujos de codigo");
    System.out.println("10.-Figura Hueca");
    System.out.println("11.-Patrones de codigo");
    System.out.println("12.-Diamante");
    System.out.println("13.-Calculadora");
    System.out.println("14.-Salir");
    
    //Condicion switch para el menu
    
    opcion = entrada.nextInt();
    
    
    switch(opcion){
        
        case 1: //problema 1
            System.out.println("Ingrese el bono A cobrar");
            Bono = entrada.nextDouble();
            System.out.println("Ingrese la edad");
            Edad = entrada.nextInt();
            //la estructura de condiciones 
            // Si esta es mayir a 65 al precio del abono se le aplica un descuento del 40%.
            if(Edad >= 65){
                //Proceso 
                Bono = Bono*.6;
                System.out.println("Su descuento es de 40%");
                System.out.println("El total a pagar es de: " + Bono);
            }
            /*
            Si la edad es menor que 21, se pregunta al usuario si sus padres son
            socios. Si la respuesta es afirmativa, se les aplica un descuento del
            45%; en caso contrario, se les aplica un 25%.
            */
            if(Edad <= 21){
                System.out.println("Si tus padres son socios ingresa 1, sino lo son ingresa 2");
                Socio = entrada.nextInt();
    
                switch(Socio){
                    case 1:
                        Bono = Bono*.55;
                        System.out.println("Su descuento fue del 45%");
                        System.out.println("El total a pagar es de: " +Bono);
                        break;
                    case 2:
                        Bono = Bono*.75;
                        System.out.println("Su descuento fue del 25%");
                        System.out.println("El total a pagar es de: " +Bono);
                        break;
                    default:
                    //Es el caso por defecto osea los demas casos
                        System.out.println("Opcion no valida");
                }
            }
            System.out.println("Tu edad es de: " + Edad);
            System.out.println("El total a pagar es: " + Bono);
            break;

            case 2:

                System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                numbinario = entrada.nextInt();
                /*
                Tengo que comprobar que sea positivo
                condiciones donde numbiario > 0
                sino no se puede convertir
                */

                if(numbinario > 0){
                    /*
                    Como el algoritmo para convertir un numero decimal en binario
                    aplica al numbinario mod 2
                    */
                    while(numbinario > 0){
                        if(numbinario % 2 == 0){
                            binario = "0" + binario;
                        }else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario / 2;
                    }
                }else if (numbinario == 0){
                    binario = "0";
                }else{
                    binario = "No se pudo convertir el numero. ingrese solo positivos";
                }
                System.out.println("El numero convertido a binario es: " + binario);
                break;


            case 3:


            case 4:


            case 5:


            case 6:


            case 7:

            
            case 8:


            case 9:


            case 10:


            case 11:


            case 12:


            case 13:


            default:
                System.out.println("Gracias por ver este hermoso programa ;3");


        
        } 
        
        System.out.println("¿Deseas repetir el programa? Si lo deseas escribe s");

        /*
        Para recibir la respuesta debo de obtener un caracter "S"
        para cuando se reciben char se utiliza ''
        para cuando se escribe String se utiliza ""
        */

        Letras = entrada.next().charAt(0);

        //si el usuario ingresa si solo detecto la "S" es la posicion del caracter que queremos lee


    }while(Letras == 's');
    //aqui se cierra el do

}
    
    
}





