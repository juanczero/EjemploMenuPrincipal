/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomenuprincipal;
import java.util.Scanner;
/**
 *
 * @author Juan Zepeda
 */
public class EjemploMenuPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        do
        {
            System.out.println("\n\n\n*** S I S T E M A  V E N T A  A P L I C A C I O N E S ***");
            System.out.println("1. Venta de Aplicaciones");
            System.out.println("2. Plan de Mantenimiento");
            System.out.println("3. Reportes");
            System.out.println("4. Salir del Sistema");
            
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1:
                    int opcionVenta = 0;
                    do{
                        System.out.println("\n\n\n*** S U B M E N U  V E N T A  A P P ***");
                        System.out.println("1.\tContabilidad Basica\tL. 40,000");
                        System.out.println("2.\tControl de Documentos\tL. 55,000");
                        System.out.println("3.\tSalir del Submenu");
                        System.out.print("Seleccione opcion de App: ");
                        opcionVenta = leer.nextInt();
                    }while(opcionVenta != 3);
                    
                    break;
                case 2:
                    System.out.println("Opcion de Sistema no disponible!");
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("... Saliendo del Sistema");
                    break;
                default:
                    System.out.println("Opcion de acceso no Disponible");
                    break;
            }
            
        }while( opcion != 4 );
        
    }
    
}
