
package Aulas;

import java.util.Scanner;

/**
 *
 * @author Miguel Palacios
 */
public class Aula01 {
    double l,area;
    
   public Aula01 (){
       
}
   
   public void receber(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o lado ");
       l=sc.nextDouble();
       sc.close();
}
   public void mostrar(){
       area=l*l;
       System.out.println("Area e igual  : "+area);
   }
  
   
}