
package problema3;

import problema2.Data;

/**
 *
 * @author Pedro Pina
 */
public class main {
     public static void main(String[] args){
         String data = "10/10/2010"; // passar data no formato xx/xx/xxxx
         String hora = "02:02";  // Passar hora no formato xx:xx
         Voo voos = new Voo(data,45,hora);
         
       
          voos.ocupa(13);
          voos.ocupa(13);
         
          voos.ocupa(14);
          voos.ocupa(15);
          voos.proximaLivre(15);
     }
}
