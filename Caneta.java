
package com.mycompany.aula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void estatus(){
        System.out.println("A caneta modelo "+this.modelo);
        System.out.println("A caneta de cor "+this.cor);
        System.out.println("A caneta esta tampada? "+this.tampada);
        System.out.println("A caneta tem uma  carga de "+this.carga);
        System.out.println("A ponta da caneta esta em "+this.ponta);
    }
    
    void rabiscar (){
        if(tampada == true){
            System.out.println("Error não posso rabiscar");
        }
        else
            System.out.println("Posso rabiscar");
            
    }
    
    void tampar() {
        this.tampada=true;
        
    }
    
    void destampar(){
        this.tampada=false;
    }
          
}
