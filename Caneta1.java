
package com.mycompany.aula03;


public class Caneta1 {
   public  String modelo;
   public  String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
    
    void estatus(){
        System.out.println("A caneta modelo "+this.modelo);
        System.out.println("A caneta de cor "+this.cor);
        System.out.println("A caneta esta tampada? "+this.tampada);
        System.out.println("A caneta tem uma  carga de "+this.carga);
        System.out.println("A ponta da caneta esta em "+this.ponta);
    }
    
    public void rabiscar (){
        if(tampada == true){
            System.out.println("Error não posso rabiscar");
        }
        else
            System.out.println("Posso rabiscar");
            
    }
    
    protected void tampar() {
        this.tampada=true;
        
    }
    
    protected void destampar(){
        this.tampada=false;
    }
          
}
