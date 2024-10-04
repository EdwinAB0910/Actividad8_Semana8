package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    //declarar variables
    String marca,marcam;
    int i,cantc;
    double precio,preciom;
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.print("Ingrese la cantidad de carros disponibles: ");
    cantc=lectura.nextInt();
    //proceso de datos
    preciom=0.0;
    marcam="";
        for ( i = 1; i <= cantc; i++) {
            System.out.print("Ingrese la marca del carro N°"+ i+":");
            marca=lectura.next();
            System.out.print("Ingrese el precio del carro N°"+ i+":");
            precio=lectura.nextDouble();
            
            if (precio>preciom) {
                preciom=precio;
                marcam=marca;
            }
        }
        //salida de datos
        System.out.println("El carro de mayor costo es de marca: "+ marcam);
        System.out.println("Su costo es de: S/."+preciom);
    }
}
