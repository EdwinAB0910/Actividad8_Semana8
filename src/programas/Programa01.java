package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        
    int i,num;
    Scanner lectura=new Scanner(System.in);
    
    System.out.print("Ingrese un número entero: ");
    num=lectura.nextInt();
    
        for ( i = num; i >=0; i-=2) {
            System.out.print(i+" - ");
        }
    }
}
