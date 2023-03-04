
package com.mycompany.aula04poo;

/**
 *
 * @author Miguel Palacios
 */
public class Carro {
    
    private String placa;
    private int numChase;
    private double velocidade;
 
    private double velocidadFinal;
    

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the numChase
     */
    public int getNumChase() {
        return numChase;
    }

    /**
     * @param numChase the numChase to set
     */
    public void setNumChase(int numChase) {
        this.numChase = numChase;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar(Double acelerar){
        
        velocidadFinal= velocidade+ acelerar;
    
        if( velocidadFinal>=180){
         System.out.println("Avelicidade maxima alacanzada ja que o maximo e 179m/h");
        }
        else if( acelerar==0){
            System.out.println("Não acelero ");
            
        }else if(velocidadFinal<0){
            System.out.println("Velocidade de aceleraçao e invalidad");
            
        }else{
                
            velocidade=velocidadFinal;
            System.out.println("=======================================");
            System.out.println("A nova velocidade e "+ velocidadFinal);
            System.out.println("=======================================");
            System.out.println("A nova velocidade e "+ velocidade);
            System.out.println("=======================================");
        }
        
        
        
        
    }
    
    public void imprimirCarro(){
        System.out.println("=======================================");
        System.out.println("A placa e do carro e : "+placa);
        System.out.println("O chassi do carro e : "+numChase);
        System.out.println("A velocidade do Carro e : "+velocidade+"m/h");
        System.out.println("=======================================");
    }
    
    
}
