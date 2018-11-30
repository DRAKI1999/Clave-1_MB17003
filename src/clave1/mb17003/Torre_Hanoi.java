package clave1.mb17003;

/**
 *
 * @author Donna
 */
public class Torre_Hanoi {
    
static int cont=1;
public void Hanoi(int n,int origen,int auxiliar,int destino){

if(n==1){
    System.out.println("Mover de "+origen+" a "+destino);
}
else{
    Hanoi(n-1, origen, destino, auxiliar);
    System.out.println("Mover de "+origen+" a "+destino);
    Hanoi(n-1,auxiliar, origen, destino);
}
//Primer Contador de movimientos
    cont++;
}

public void contar(int n){
//Segundo contador de movimientos
    int c=0;
    c=(int)Math.pow(2, n);
    c=c-1;
    System.out.println("\nCantidad de movimientos :      "+c+"\n\n");
}
}
