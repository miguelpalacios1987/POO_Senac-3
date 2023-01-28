
package com.mycompany.aula03;


public class Caneta2 {
  
        
       public String modelo2; 
       private String cor ;
       private float  ponta;
       private  boolean tampada;
       
        
//       
     public Caneta2(String m,String c, float p){//metodo construtor
           tampar();
           this.cor = c;
           this.modelo2= m;
           this.ponta= p;
       }
        
    public String getModelo(){
          return this.modelo2;   
    }
    public  void setModelo(String m){
        this.modelo2 = m;
    }
    public void tampar(){
     this.tampada = true;   
     
    }
    public void destampar(){
        this.tampada=false;
    }
    
    public float getPonta(){
     return this.ponta;   
    }
    public void setPonta(float p){
        this.ponta= p;
        
    }
    
    public String getCor(){
     return this.cor;   
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public  void  status(){
        
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo "+this.getModelo());
        System.out.println("Ponta "+this.getPonta());
        System.out.println("Cor "+this.cor);
        System.out.println("Esta tampada? "+this.tampada);
    }

    
  
}
