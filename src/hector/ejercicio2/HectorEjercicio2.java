
package hector.ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIELCASTELAO\hposecarames
 */
public class HectorEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilos hilo1 = new Hilos();
        Hilos hilo2 = new Hilos();
        Hilos hilo3 = new Hilos();
        
                
        hilo3.start();
        try {
            hilo3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HectorEjercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HectorEjercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        hilo1.start();
        try {
            hilo1.join();
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(HectorEjercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El programa terminó");
    }
    
}
