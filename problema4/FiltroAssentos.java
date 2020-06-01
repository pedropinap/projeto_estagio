/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.LinkedList;
import problema3.Voo;

/**
 *
 * @author Pedro Pina
 */
public class FiltroAssentos extends Voo{
   
    public FiltroAssentos(String dataVoo, int numero, String hora, int numFumantes, int numVagas) {
        super(dataVoo, numero, hora);
        this.numeroAssentosFumantes = numFumantes;
       
        this.maxAssentos = numVagas;
       
        
    }
     int maxAssentos;
     int numeroAssentosFumantes;
    
     LinkedList<Integer> assentosFumantes = new LinkedList<>();
     LinkedList<Integer> assentosNaoFumantes = new LinkedList<>();
   
     
  public void maxVagas(int max){
        this.maxAssentos = max;
        cadeirasFumantes();
               
  }
    
   
    public void cadeirasFumantes(){
       
     if(!this.assentos.isEmpty()){
           int auxX,auxY=maxAssentos-numeroAssentosFumantes;
         System.out.println("\nAssento registrados para fumantes:" );
           for(auxX=maxAssentos-1;auxX>=(maxAssentos-numeroAssentosFumantes);auxX--)
                 {
                      
                    this.assentosFumantes.addLast(assentos.get(auxX));
                     System.out.printf("Assento:" + assentos.get(auxX) + " \t"); 
                     if(auxX%2==0){ System.out.println(" ");}
                     assentosNaoFumantes.addLast(this.assentos.get(auxX));
                    
                    
                 }    
           
            
                     
     }
    }

   public String tipo(int numeroAssento){
      if(!assentosFumantes.contains(numeroAssento)){
          return "N";
            
      }
      else{  
      return "F";
      }
   
   
   }



    @Override
    public boolean ocupa(int esc_cadeira) {
         int x;
      if(!this.assentos.isEmpty()){
     
         if(!this.assentos_ocupadas.contains(esc_cadeira)){ 
             for(x=0 ; x<maxAssentos; x++)
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
    
   @Override
    public int proximaLivre(int escolha) {
          int ajudante = escolha;
    if(!assentos_ocupadas.contains(escolha)){
        System.out.println("A cadeira escolhida está desocupada!");
        return 0;
   }    
   else{
       System.out.println("Sua escolha encontrasse ocupada!");
       for(int x=0;x<maxAssentos;x++){
           if(assentos.get(x)>escolha){
               if(assentos.get(x)>escolha)
           System.out.println("O proximo assento livre é: " + assentos.get(x) + "\n");
           return assentos.get(x);
       } }
   }
        return 0;
  }


    @Override
    public int vagas() {
     System.out.println("Os assentos vagos são:\n");
       
       for(int x= 0;x< maxAssentos; x++){
         System.out.printf("assento:" + assentos.get(x) + " \t");
          if(x%2!=0){ System.out.println(" ");}
         
        
         
     }
     System.out.println("\nExiste " + assentos.size() +" assentos livres");     
     return maxAssentos;
     
    }

}
