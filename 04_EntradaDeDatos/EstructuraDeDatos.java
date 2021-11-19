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
import java.util.ArrayList;
import java.lang.System;
import java.lang.Math;

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
    int Edad, opcion, Socio, numbinario, total, numerototal, Numero, factorial, iterador, n, a, b, h, ca, cp, ra, rp, tp, ta;
    int positivos = 0;
    int negativos = 0;
    double Precio, Bono;
    char Letras, operacion;
    float precios = 0;
    float resultado = 0;
    int cantidad = 0;    
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
                int op=1;
                while(op!=7){
                    System.out.println("Seleccione la conversion que desea realizar: ");
                    System.out.println("1.-Celcius a Farenheit");
                    System.out.println("2.-Farenheti a Celcius");
                    System.out.println("3.-Celcius a Kelvin");
                    System.out.println("4.-Kelvin a Celcius");
                    System.out.println("5.-Kelvin a Farenheit");
                    System.out.println("6.-Farenheit a Kelvin");
                    System.out.println("7.-Salir");
                    op = entrada.nextInt();
                    
                    double t,r;
                    
                    switch(op){
                        case 1:
                            System.out.println("Ingrese la temperatura en grados Celcius: ");
                            t = entrada.nextFloat();
                            r = t * (9.0 / 5.0) + 32;
                            System.out.println(t+"Celcius son igual a "+r+" Farenheit ");
                            System.out.println("¿Desea realizar otra conversion? Presione 7 para salir o 1 para continuar");
                            op = entrada.nextInt();
                            
                            break;

                        case 2:
                            System.out.println("Ingrese la temperatura en grados Farenheit");
                            t = entrada.nextFloat();
                            r = (t - 32) * (5.0 / 9.0);
                            System.out.println("t+ Farenheit son igual a "+r+" Celcius");
                            System.out.println("¿Desea realizar otra conversion? Presione 7 para salir o 1 para continuar");
                            op = entrada.nextInt();
                            
                            break;
                        
                        case 3:
                            System.out.println("Ingrese la temperatura en grados Celcius");
                            t = entrada.nextFloat();
                            r = t+273.15;
                            System.out.println(t+ "Celcius son igual a "+r+" Kelvin");
                            System.out.println("¿Desea realizar otra conversion? Presione 7 para salir o 1 para continuar");
                            op = entradaInt();
                            
                            break;

                        case 4:
                            System.out.println("Ingrese la temperatura en grados kelvin");
                            t = entrada.nextFloat();
                            r = t - 273.15;
                            System.out.println(t+ "Kelvin son igual a "+r+" Celcius");
                            System.out.println("¿Desea realizar otra conversion? Presione 7 para salir o 1 para continuar");
                            op = nextInt();
                            
                            break;

                        case 5:
                            System.out.println("Ingrese la temperatura en grados Kelvin");
                            t = entrada.nextFloat();
                            r = (t-273.15) * (9.0/5.0) + 32;
                            System.out.println(t+ "Kelvin son igual a "+r+" Farenheit");
                            System.out.println("¿Desea realizar otra conversion? Presione 7 para salir o 1 para continuar");
                            op = entrada.nextInt();

                            break;

                        case 6:
                            System.out.println("Ingrese la temperatura en grados Farenheit");
                            t = entrada.nextFloat();
                            r = (t-32) * (5.0/9.0) + 273.15;
                            System.out.println(t+ "Farenheti son igual a "+r+" Kelvin");
                            System.out.println("¿Desea realizar otra conversion? Presione 7 para salir o 1 para continuar");
                            op = entrada.nextInt();

                            break;

                        default:
                        System.out.println("Gracias por usar esta conversion de grados");
                    }
                }

                break;


            case 4:

            /*
            Un numero positivo y un num negativo
            entonces para poder identificar si un numero positivo o negativo
            debo de poder diferenciar si es 
            num > 0
            */

            System.out.println("Inserte ¿Cuantos numeros va a ingresar?");
            total = entrada.nextInt();
            do {
                System.out.println("Inserte el numero");
                numerototal = entrada.nextInt();

                //condicion
                if(numerototal == 0){
                    //contar cuantos positivos hubo
                    //vamos a ir acumulando el numero de positivos 
                    positivos = positivos + 0;

                }else{
                    if(numerototal > 0){
                        positivos = positivos +1;
                    }else{
                        negativos = negativos +1;
                    }
                }

                //saber el total
                total = total-1;



            }while(total != 0);
            
            System.out.println("El total de positivos es: "+ positivos);
            System.out.println("El total de negativos es: "+ negativos);

            break;

            case 5:
                System.out.println("¿Cuantos elementos vas a ingresar?");
                total = entrada.nextInt();

                for(int i = 1; i <= total; i++){
                    System.out.println("Ingrese el Precio del producto");
                    precios = entrada.nextFloat();
                    System.out.println("Ingresa la Cantidad del producto");
                    cantidad = entrada.nextInt();

                    resultado = precios * cantidad;
                }

                System.out.println("El resultado es: " + resultado);


            case 6:

                System.out.println("Seleccione la figura que desea calcular: ");
                System.out.println("1.-Circulo");
                System.out.println("2.-Cuadrado");
                System.out.println("3.-Triangulo");
                System.out.println("4.-Rectangulo");
                System.out.println("5.-Salir");
                op = entrada.nextInt();

                switch(op){
                    case 1:
                        System.out.println("Ingrese el radio del circulo");
                        double ci = entrada.nextFloat();
                        double cia = Math.PI*Math.pow(ci, 2);
                        double cip = 2 * Math.PI * ci;
                        System.out.println("El area del circulo es de: "+cia+" cm");
                        System.out.println("El perimetro del circulo es de: "+cip+" cm");
                        
                        break;
                    
                    case 2:
                        System.out.println("Introdusca la medida de un solo lado del cuadrado");
                        double l = entrada.nextDouble();
                        ca = 1 * 1;
                        cp = 1 * 4;
                        System.out.println("El area del cuadrado es de: "+ca+" cm");
                        System.out.println("El perimetro del cuadrado es de: "+cp+" cm");

                        break;

                    case 3:
                        System.out.println("Introduce la medida del primer lado");
                        double L1 = entrada.nextDouble();
                        System.out.println("introduce la medida del segundo lado");
                        double L2 = entrada.nextDouble();
                        System.out.println("Introduce la medida del tercer o base del triangulo");
                        double L3 = entrada.nextDouble();
                        System.out.println("introduce la altura del triangulo");
                        h = entrada.nextDouble();
                        tp = L1 + L2 + L3;
                        ta = (L3 * h) / 2;
                        System.out.println("El area del triangulo es de: "+ta+" cm");
                        System.out.println("El perimetro del triangulo es de: "+tp+" cm");

                        break;

                    case 4:
                        System.out.println("Ingrese la base del rectangulo");
                        double ba = entrada.nextDouble();
                        System.out.println("Ingrese la altura del rectangulo");
                        double ha = entrada.nextDouble();
                        ra = ba * ha;
                        rp = (ba * 2) + (h + 2);
                        System.out.println("El area del rectangulo es de: "+ra+" cm");
                        System.out.println("El perimetro del rectangulo es de: "+rp+" cm");

                        break;
                    case 5:

                        default:
                        System.out.println("Gracias por utilizar este programa");
                }

                break;

            case 7:
                for(n = 1; n <= 10; n++){
                    System.out.println(n + "" + (n*10) + "" + (n*100) + "" + (n*1000));
                }
                break;

            case 8:
                System.out.println("Introduce el digito");
                
                factorial = factorial * iterador;

                while(Numero == 1){
                    factorial = factorial - 1;
                }
                break;


            case 9:
                /* 
                Escriba un programa que lea el lado de un cuadrado y a continuacion lo imprima
                en forma de sus astericos su programa debera poder funcionar para cuadrados 
                de todos tamaños entre 1 y 20
                */

                System.out.println("Cuadrado magico");
                System.out.println("Inserta el num de lados: ");
                n = entrada.nextInt();

                if(n >= 1 && n <= 20){
                    //se puede imprimir
                    //aqui tengo las filas
                    for(int i = 1; i<=n; i++){
                        //columnas
                        for(int j = 1; j <= n; j++){
                            System.out.println("* ");
                        }
                        System.out.println("");

                    }

                }else{
                    System.out.println("Error, el rango debe de ser 1 y 20, intente de nuevo");
                }

                break;


            case 10:
                System.out.println("Cuadro Magico hueco");
                System.out.println("Inserte el num de lados: ");
                n = entrada.nextInt();

                if(n >= 1 && n <= 20){
                    //se puede imprimir

                    //imprima la linea superior
                    for(int i = 0; i < n; i++){
                        System.out.print(" * ");

                    }
                    System.out.println();

                    //lo de enmedio solo quiero las esquinas 
                    //cuadro interno
                    //aqui tengo las filas
                    for(int i = 0; i < n-2; i++){
                        System.out.println(" * ");
                        //columnas
                        for(int j = 0; j < n-2; j++){
                            System.out.print(" ");
                        }
                        System.out.println(" * ");

                    }

                    //imprimir la linea inferior 
                    for(int i = 0; i < n; i++){
                        System.out.println(" * ");
                    }
                    System.out.println();
                }else{
                    System.out.println("Error, el rango debe de ser entre 1 y 20, intente de nuevo");
                }

                break;


            case 11:


            case 12:


            case 13:
                System.out.println("Calculadora maizsoro");
                System.out.println("Ingresar un número");
                a = entrada.nextInt();
                System.out.println("Ingresa un segundo número");
                b = entrada.nextInt();
                System.out.println("Ingresa el tipo de operacion que deseas realizar : (+ , -, *, /)");
                operacion = entrada.next().charAt(0);

                /*
                switch
                    case +
                    case -
                    case *
                    case /
                */

                switch(operacion){
                    case '+' :
                        resultado = a+b;
                        System.out.println("La suma es de: " + resultado);
                        break;
                    case '-' :
                        resultado = a-b;
                        System.out.println("La resta es de: " + resultado);
                        break;
                    case '*' :
                        resultado = a*b;
                        System.out.println("La multiplicacion es de: " + resultado);
                        break;
                    case '/' :
                        if(b != 0){
                            resultado = a/b;
                            System.out.println("La division es de: "+ resultado);
                        }else{
                            System.out.println("No es posible dividir entre 0");
                        }
                        break;
                    default :
                        System.out.println("Operacion no valida");

                }


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





