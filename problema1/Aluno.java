
package problema1;

/**
 *
 * @author Pedro Pina
 */
public class Aluno {
    int matricula;
    String nome;
    double provnota1,provnota2,trabnota;

    public Aluno(int matricula, String nome, double provnota1, double provnota2, double trabnota) {
        this.matricula = matricula;
        this.nome = nome;
        this.provnota1 = provnota1;
        this.provnota2 = provnota2;
        this.trabnota = trabnota;
    }



public double Media(){
    double media,pesoprova1,pesoprova2,pesotrab;
     media = ((2.5*this.provnota1) + (2.5*this.provnota2) + (2*this.trabnota))/(2.5+2.5+2);
     
        
        
    return media;
    }

public double Final(double media){
    if(7.0<media){   //Usei o valor de 5.5 para ser o limite de passar
        
        return 0;
    }
    else{
        double falta;
     falta= 7.0 - media;
    
     return falta;
       
   }

}}
