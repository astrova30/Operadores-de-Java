package javabasico;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        /*Calcular el área de un triángulo*/
        /*ENTRADAS */
        System.out.println( "1.Calcular el área de un triángulo");
        System.out.println( "Ingrese la base del triángulo: ");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();
        System.out.println( "Ingrese la altura del triángulo: ");
        double height =src.nextDouble();

        /*PROCESO */
        double result = (base * height)/2;

        //SALIDA
        System.out.println("El área del triángulo es:" + result);




        /*Ingresar dos números por teclado y sumarlos */

        /*ENTRADAS */
        System.out.println("Ingresar dos números y por teclado y sumarlos");
        System.out.println( "Ingrese el primer valor"  );

        Scanner zoom  = new  Scanner(System.in);
        int n3 = src.nextInt();

        System.out.println("Ingrese el segundo valor");
        int n4 = src.nextInt();

        /*PROCESO */
        int suma =(n3+n4);

        /*SALIDA */

        System.out.println("la suma entre estos números es:" + suma);



        /*Ingresar dos números por teclado y sumarlos */

        /*ENTRADAS */
        System.out.println("Ingresar un número y visualizar el número al cuadrado");
        System.out.println( "Ingrese el la base"  );

        Scanner pot = new Scanner (System.in);
        int b = src nextInt();

        System.out.println("Ingrese el exponente");
        int x = src.nextInt();

        /*PROCESO */
        int potencia =(b^x);

        /*SALIDA */
        System.out.println("la potenciaón entre estos números es:" + potencia);



    }
}
