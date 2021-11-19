import java.util.*;

public class Ejercico{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        
        //vamos hacer los contadores de numeros positivos y negativos
        int pos = 0, neg = 0;

        //array que tendra los numeros leidos por el teclado
        int[] numeros = new int[10];

        //Acumulador para las sumas de positivos y negativos
        double sumaPos = 0, sumaNeg = 0;

        System.out.println("Ingrese 10 digitos: ");
        for(i = 0; i < 10; i++){
            System.out.print("Numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

        //sumar por separado los numeros positivos y los negativos
        for(i = 0; i < 10; i++){
            //sumar positivos
            if(numeros[i] > 0){
                sumaPos += numeros[i];
                neg++;
            }
        }

        //Calcula y muestra las medidas
        if (pos != 0){
            System.out.println("La media de los positivos: " + sumaPos / pos);
        } else {
            System.out.println("Error, No hay positivos");
        }
        if(neg != 0){
            System.out.println("La media de los positivos: " + sumaNeg / neg);
        } else{
            System.out.println("Error, No hay negativos");
        }
    }
}