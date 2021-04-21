/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2horario;
import java.util.Scanner;
/**
 *
 * @author Johnny Reveles
 */
public class Actividad2Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Primer ejercicio");
        // CREAR UN HORARIO DE USTED DE CUALQUIER DÍA DE LA SEMANA. LEER UN VALOR DEL 1 AL 24, VALIDAR E IMPRIMIR LA ACCIÓN QUE SE REALIZA EN SU HORARIO.
    
    int valor1 = 0;
    
    Scanner miConsola = new Scanner(System.in);
    
        System.out.println("Ingresa un número entero del 1 al 24 para que conozcas una acción de mi horario");
        valor1 = miConsola.nextInt();
            
   switch (valor1) {
       case 24, 1, 2, 3, 4, 5:
           System.out.println("Dormir");
           break;
       case 6:
           System.out.println("Despertar");
           break;
       case 7:
           System.out.println("Desayunar");
           break;
       case 8, 9, 10:
           System.out.println("Clase de Cálculo Integral");
           break;
       case 11, 12:
           System.out.println("Clase de Álgebra Lineal");
           break;
       case 13, 14, 15:
           System.out.println("Entrenar en el gimnasio");
           break;
       case 16:
           System.out.println("Almorzar");
           break;
       case 17, 18, 19:
           System.out.println("Ver mi serie");
           break;
       case 20:
           System.out.println("Cenar");
           break;
       case 21:
           System.out.println("Bañarme y cepillarme los dientes");
           break;
       case 22, 23:
           System.out.println("Acostarme en mi cama y ver videos en YouTube");
           break;
       default:
           System.out.println("Ingresaste un dato incorrecto");
           
           
       
           
   }        
        
        
    }
    
}
