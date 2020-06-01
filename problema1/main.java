/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Pedro Pina
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aluno aluno = new Aluno(333, "teste", 5.5 , 5.5 ,5.5);
      System.out.printf("A média do aluno é: %.2f \n",aluno.Media());
      if(0<aluno.Final(aluno.Media())){
      System.out.printf("falta para a prova final: %.2f\n",aluno.Final(aluno.Media())); }
      
      else{
              System.out.println("O aluno não vai para prova final");
              }
     }
    }

    

