
package Problema5;


/**
 *
 * @author Pedro Pina
 */
public class ProdutoFab implements IProdutoFabricado{
    String nome;
    Ingrediente[] ingredientes;   //Criei um vetor de objeto ingrediente que contem o nome e o custo;
    
    @Override
    public int getNumeroIngredientes() {
      return ingredientes.length;
    }
    @Override
    public float getCusto() {
        int auxX;
        float auxY;
        float valorSomaIngredientes = 0;
       for(auxX = 0 ; auxX < this.ingredientes.length; auxX++){
           auxY= this.ingredientes[auxX].getCusto()+this.ingredientes[auxX+1].getCusto(); //Soma os valores dos ingredientes;
           valorSomaIngredientes = valorSomaIngredientes + auxY;
       }
       return valorSomaIngredientes;
    }

    @Override
    public IProduto getIngrediente(int numero) {
       
        System.out.println(this.ingredientes[numero].getNome());
        return this;
    }

    @Override
    public String getNome() {
       return this.nome;
    }

  
   
    
    public ProdutoFab reducaoPreco(ProdutoComprado produto){
        Ingrediente[] ingredientesLoc;  //Auxiliar para guardar os ingredientes do produtoComprado;
        float valorCompra, valorFabri;  
        GerenteProdutos gerente = new GerenteProdutos();
        ingredientesLoc = gerente.ingredientes(produto.getNome()); //Passa para o auxiliar a lista adquirida pelo GerenteProdutos;
        valorFabri = this.getCusto(ingredientesLoc); //Usa o método existente na própria classe para o calculo do valor total ;
        valorCompra = gerente.valorCompra(produto.getNome());
        
        if(valorFabri<valorCompra){
            ProdutoFab produtoCtoF = new ProdutoFab();
            produtoCtoF.nome = produto.getNome();
            produtoCtoF.ingredientes = gerente.ingredientes(produto.getNome());
             int auxX;
            for(auxX = 0; auxX<produtoCtoF.ingredientes.length;auxX++){
                  produtoCtoF.ingredientes[auxX].setCusto((float) (produtoCtoF.ingredientes[auxX].getCusto()-(produtoCtoF.ingredientes[auxX].getCusto()*0.05))); 
                           
            }
            return produtoCtoF;
        } 
        return null;
       
    }
      public float getCusto(Ingrediente[] ingredientesLoc) {
        int aux;
        float[] custoIngredientes = {1,1};                        //Calcula o custo dos ingredientes do produto Comprado
        float valorSomaIngredientes = 0, aux2;                    // Com a lista de ingredientes passada pelo GerenteProdutos;            
        for(aux = 0 ; aux < ingredientesLoc.length; aux++){   
            aux2 = custoIngredientes[aux] + custoIngredientes[aux + 1];
            valorSomaIngredientes= valorSomaIngredientes + aux2;
        
}
        return valorSomaIngredientes;
    }

  
}
