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
public class ProdutoComprado implements IProduto{
    String nome;
    float custo;




    @Override
    public String getNome() {
       return this.nome;
    }

    @Override
    public float getCusto() {
        return this.custo;
    }
      
    
}
