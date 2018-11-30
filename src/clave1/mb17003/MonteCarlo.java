/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1.mb17003;

import java.util.Random;

/**
 *
 * @author Donna
 */
public class MonteCarlo {
    private final double l;
    private int N;
    private int t;
    //números aleatorios
    private final Random rnd=new Random();
    public MonteCarlo(double l, int N) {
        this.l=l;
        this.N=N;
	t=0;
    }
    public int getParticulas(){return N;}
    public int evolucion(int dt){
        int N1;
        for(int k=0; k<dt; k++){
            N1=0;
            for(int i=0; i<N; i++){
                if(rnd.nextDouble()<l)  N1++;
            }
            t+=dt;
            N-=N1;
        }
        return N;
    }
    

}
   
