/*
Menu del programa...se llama a cada clase/método desde esté menu
 */
package clave1.mb17003;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Graphics;
import static javafx.application.Platform.exit;

public class Menu {
    //atributos
    boolean bandera=false;
    Graphics g;
    Scanner sc = new Scanner(System.in);
    //1
    int n;
    int opp;
    //2
    int N0=10000;   //núcleos iniciales
    double cte=0.1; //constante de desintegración
    int dt=5;           //intervalo de tiempo entre observaciones
    //Instancia singleton
     private static Menu instance;
    //Constructor
    private Menu(){
    }
    public static Menu getInstance(){
        
        
        if(instance==null){
            
            instance=new Menu();
            
        }
        return instance;
    }
    public int getopp(){
        return opp;
    }
    @SuppressWarnings("empty-statement")
    public void setopp(int opp){
        
        this.opp=opp;
        
        switch(opp){
            //Opcion 1
            case 1:{
                //llamamos a la clase  Torre_Hanoi
                
                do{
                 try{   
                    System.out.print("Numero de discos(menos de 30 por favo: ");
                    n=sc.nextInt();
                    bandera=true;
                    
                } catch(NumberFormatException ex){
                    System.out.println("No es un número");
                    bandera=false;
                }    
                if(n>30){
                    System.out.println("Menos de 30!!!");
                }
                }while(n>30 || bandera==false);
                        
                Torre_Hanoi torre=new Torre_Hanoi();
                
                torre.Hanoi(n, 1, 2, 3);
                
                torre.contar(n);
               
                break;
            }
            
            //Opcion 2
            case 2:{
                //Aplicaremos el método MonteCarloa a:
                System.out.println("La ley de desintegración radioactiva \n*Método de MonteCarlo*");
                //Lllamamos a la clase MonteCarlo
                MonteCarlo radia=new MonteCarlo(cte, N0);
                System.out.println("Tiempo \t núcleos");
                System.out.println(" 0 \t "+N0);
                for(int i=1; i<10; i++){
                    System.out.println(" "+i*dt+" \t "+radia.evolucion(dt));
                }
                try  {
                    System.in.read();
                }catch (IOException e) {  
                }
              
                break;
            }
            case 3:{
                //Salir
                exit();
                break;
            }
            default:{
                System.out.println("La opcion ingresada es incorrecta!");
            }
        }
    }
}
