/*
Clave 1:
Hacer un programa en java que muestre el siguiente menú:
1-Resolver la torre de hanio
2-Simular MosnteCarlo
3-Mostrar forma gráfica
4-Salir
 */
package clave1.mb17003;
import java.util.*;
import java.util.Scanner;
import static javafx.application.Platform.exit;
/**
 *
 * @author Donna
 */
public class Clave1MB17003 {
    public static void main(String[] args) {
        //Atributos
        int Captura = 0;
        int men;
        //Objeto del paquete Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t~~~~~~~Donna Nicole Martínez Blanche - MB17007~~~~~~~\n\t\t ~~~~~~~-Clave 1-programacion III~~~~~~~");
        do{
            //************************************************************************
            System.out.println("\t\t\t*****MENU*****");
            System.out.println("\n\t1-Resolver las Torres de Hanoi\n\t2-Simulacion Metodo de MonteCarlo\n\t3-Salir");
            //*************************************************************************
           //Llama a la instancia del objeto singleton Menu
           
            Menu menu=Menu.getInstance();
            men=sc.nextInt();
        
            menu.setopp(men);
        
             //
             
            if(men==4){
                exit();
            }
            else{
                System.out.println("Desea Salir??? *0*...\nPecione 1 sidesea continuar");
            Captura=sc.nextInt();
            }
        
        }while(Captura==1);
    }
    
}
