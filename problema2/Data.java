
package problema2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Pedro Pina
 */
public class Data  implements Cloneable{

    Calendar data = Calendar.getInstance() ; 

    public Data() {
    }
   

public Data(String dataString, String hora1) {
   
     SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy/HH:mm");
     formato.setLenient(false);
     Date datapadrao = new Date(00,00,0001,00,00);                       //Adptação de um novo construtor para ser empregado na classe voo
     dataString  = dataString + "/" + hora1;
     
     try {
           
           
            this.data.setTime(formato.parse(dataString));
            System.out.println(this.data.getTime() + "\n");
          
     } catch (ParseException ex) {
         
           this.data.setTime(datapadrao);
           
        }
    }

    public Calendar getdata() {
        return data;
    }

    
 public Data(String dataString) {
   
     SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
     formato.setLenient(false);
     Date datapadrao = new Date(00,00,0001);
     
     try {
           
           
            this.data.setTime(formato.parse(dataString));
            System.out.println(this.data.getTime());
          
     } catch (ParseException ex) {
         
           this.data.setTime(datapadrao);
           
        }
    }

public  int getDia(){
    return data.get(Calendar.DAY_OF_MONTH);
}

public  int getMes(){
  
    return data.get(Calendar.MONTH)+1 ; //  + 1 pois janeiro tem o valor 0;;

}

public  int getAno(){
    
    return data.get(Calendar.YEAR);
}

public  String getMesExtenso (){
     DateFormat dformato = new SimpleDateFormat(" MMMM ");
        
        return dformato.format(data.getTime());
}


 public boolean isBissexto(){
        GregorianCalendar gc = new GregorianCalendar();
            if(gc.isLeapYear(this.data.get(Calendar.YEAR))){
             System.out.println("O ano: " + this.data.get(Calendar.YEAR) + " é bissexto.");
            return true;
           }
            System.out.println("O ano: " + this.data.get(Calendar.YEAR) + " não é bissexto.");
        return false;
   }

    @Override
     protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }


    
}
