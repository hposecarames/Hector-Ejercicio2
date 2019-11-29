
package hector.ejercicio2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIELCASTELAO\hposecarames
 */
public class Hilos extends Thread{
    @Override
    public void run(){
        
        for(int i =1;i<26;i++){
            System.out.println(i+" "+this.getName());
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
