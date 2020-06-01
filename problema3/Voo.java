
package problema3;


import java.util.Calendar;
import java.util.LinkedList;
import problema2.Data;

/**
 *
 * @author Pedro Pina
 */
public class Voo {
    int numeroDoVoo;
    Data data ;
   public LinkedList<Integer> assentos = new LinkedList<>();
   public LinkedList<Integer> assentos_ocupadas = new LinkedList<>();
   

    public Voo(String dataVoo, int numero, String hora) {
        System.out.println("Vôo registrado: "); 
        this.data = new Data(dataVoo,hora);
        this.numeroDoVoo = numero;
        
        int x;
       for(x = 0;x<100;x++){
        assentos.addLast(x+1);
           
    }
    }

  
  public int getVoo() {
        return numeroDoVoo;
    }

  public int getassentos() {
        return assentos.size();
    
  }
  public  boolean ocupa(int esc_cadeira){
       int x;
      if(!assentos.isEmpty()){
     
         if(!assentos_ocupadas.contains(esc_cadeira)){ 
             for(x=0 ; x<assentos.size(); x++)
            {
             
              if(assentos.get(x)==esc_cadeira){
                   assentos_ocupadas.add(assentos.get(x));
                   assentos.remove(x);
                   System.out.println("Operação foi bem sucedida\n");
                   return true;
                   
              
              }
           }
        }
         else{
             System.out.println("Esta cadeira não está desocupada!");
       
         }
      }
      else{
          System.out.println("Não há assentos livres");
          
      }
    return false;
  }
 public int vagas(){
       System.out.println("Os assentos vagos são:\n");
       
       for(int x= 0;x< assentos.size(); x++){
         System.out.println(assentos.get(x));
 
        
         
     }
     System.out.println("Existe " + assentos.size() +" assentos livres");     
     return assentos.size();
 } 

public int proximaLivre(int escolha){
   int ajudante = escolha;
    if(!assentos_ocupadas.contains(escolha)){
        System.out.println("A cadeira escolhida está desocupada!");
        return 0;
   }    
   else{
       System.out.println("Sua escolha encontrasse ocupada!");
       for(int x=0;x<assentos.size();x++){
           if(assentos.get(x)>escolha){
               if(assentos.get(x)>escolha)
           System.out.println("O proximo assento livre é: " + assentos.get(x));
           return assentos.get(x) ;
       }

   }
   
}
return 0;
}     




}

