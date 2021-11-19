import java.util.*;

public class Ejercicio2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;

        System.out.println("Ingrese 10 numeros");
        for(i = 0; i < 10; i++){
            System.out.print("Numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        //Calcular la media
        for(i = 0; i < 10; i++){
            //Si la posicion actual es par
            if(i % 2 == 0){
                //suma el valor de esa posicion
                media = media + numeros[i];
            }
        }
        //Mostrar media
        System.out.println("la posiciones pares: " + media/5);
    }
}