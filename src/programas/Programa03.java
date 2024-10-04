package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
    
    //declarar variables
    int i,opc,cantc;
    String nombre;
    
    Scanner lectura=new Scanner(System.in);
    
    //ingreso de datos
    System.out.print("Ingrese la cantidad de compradores: ");
    cantc=lectura.nextInt();
    
        for ( i = 1; i <= cantc; i++) {
            System.out.println("Escriba su nombre: ");
            nombre=lectura.next();
            System.out.println("----MENU DE OPCIONES----");
            System.out.println("1. Hogar");
            System.out.println("2. Dormitorio");
            System.out.println("3. Cocina");
            System.out.println("4. Baño");
            System.out.println("5. Patio");
            System.out.println("6. N/A");
            System.out.println("Elija una opción:");
            opc=lectura.nextInt();
            
            switch (opc) {
                case 1:System.out.println(nombre+" podrás ver los productos de Hogar");
                    break;
                case 2:System.out.println(nombre+" podrás ver los productos de Dormitorio");
                    break;
                case 3:System.out.println(nombre+" podrás ver los productos de Cocina");
                    break;
                case 4:System.out.println(nombre+" podrás ver los productos de Baño");
                    break;
                case 5:System.out.println(nombre+" podrás ver los productos de Patio");
                    break;    
                case 6:System.out.println(nombre+" Gracias por la visita");
                    break;
                }
            }
    }
}

