/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author Pedro Pina
 */
public class main {
    public static void main(String[] args){
    String data = "10/10/2010"; 
    String hora = "02:02"; 
    FiltroAssentos nn = new FiltroAssentos(data, 01255, hora, 20, 40);
    nn.cadeirasFumantes();
    nn.maxVagas(60);
    
    nn.tipo(59);
    nn.proximaLivre(24);
    nn.vagas();
    }
}
