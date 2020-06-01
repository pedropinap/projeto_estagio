
package problema2;

import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Pina
 */
public class main {
 
        public static void main(String[] args){
           String data = "13/12/2020"; // passar data no formato xx/xx/xxxx
           Data criarData = new Data(data);
           System.out.println("\n DATA ORIGINAL  \n");
            System.out.println("Dia:"+criarData.getDia()+ " Mês:" + criarData.getMes() + " Ano:" + criarData.getAno());
            System.out.println("Mês: " + criarData.getMesExtenso());
            criarData.isBissexto();
            Data cloneData = new Data();
            try {
                cloneData = (Data) criarData.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\n DATA CLONADA  \n");
            System.out.println("Dia:"+cloneData.getDia()+ " Mês:" + cloneData.getMes() + " Ano:" + cloneData.getAno());
            System.out.println("Mês: " + cloneData.getMesExtenso());
            cloneData.isBissexto();
           
          
           
           
           
           
           
        }
        
}
