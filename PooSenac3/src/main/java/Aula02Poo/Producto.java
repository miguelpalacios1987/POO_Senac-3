
package Aula02Poo;

/**
 *
 * @author Miguel Palacios
 */
public class Producto {
    
    String nome;
    int quantidade;
    double preço,valorD,valorT;
    
    
    void inicialValor(String no,int qua,double pre){
        nome=no;
        quantidade=qua;
        preço=pre;
        
        
        
    }
     void   calcularDesconto(){
      
     if(quantidade>=11 && quantidade<=20){
          valorD=valorT*0.10;
     }else if (quantidade>=20 && quantidade <=50){
         valorD=valorT*0.20;
      }else if(quantidade>=50){
       valorD=valorT*0.25;
      }else{
          valorD=0;
      }
     }
    void calcularValorTotal(){    
         
         valorT=(preço*quantidade)-valorD;
        
    }
    void escreverValores(){
        
        calcularValorTotal();
        calcularDesconto();
        System.out.println("O produto " +nome+ " tem um valor final de " +valorT+" descuento"+valorD);
        
    }
 
      
     
      
     
        
    }
  
  
    
    

