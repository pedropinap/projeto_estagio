/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

/**
 *
 * @author Pedro Pina
 */

public class GerenteProdutos {
  
                
       
    public Ingrediente[] ingredientes(String nome){

        Ingrediente[] vetorIngredientes = null;
      int x = 0;    
    
      
        for(x=0;x<10;x++){
          vetorIngredientes[x].setCusto(x);
          vetorIngredientes[x].nome = nome;  
        }
       return vetorIngredientes;
            }

  

    float valorCompra(String nome) {
        ProdutoComprado teste = new ProdutoComprado();
        return teste.getCusto();
    }
}
