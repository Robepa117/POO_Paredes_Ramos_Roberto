class EntradaTexto{

    //cuerpo del programa o de la clase

    public static void main(String[] args){
        
        //cuerpo del metodo principal

        /*
        vamos a realizar un programa en el cual podemos introducir
        texto a nuestra conveniencia 
        */
        //tipo de dato,       nombre de la variable
        String Nombre;
        //Ln en el print es para un salto de linea despues de la impresion en consola
        System.out.println("Por Favor introduce tu nombre: ");

        Nombre = System.console().readLine();
        /*
        para poder concaenar [agregar algo a una cadena de texto]

        aqui estoy concatenando la variable "Nombre" para ello se usa "+ +"
        */
        System.out.print("Hola, "+ Nombre + " Bienvenido a tu segundo programa");
    }
}