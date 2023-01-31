/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03.exercicioBanco1;

/**
 *
 * @author Miguel Palacios
 */
public class Contabanco {
    
    public int numConta;
    public float vm;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoActual(){
        System.out.println("---------------------------------");
        System.out.println(" Conta e igual "+ this.getNumConta());
        System.out.println("O dono da conta e "+this.getDono());
        System.out.println("O saldo da conta e "+this.getSaldo());
        System.out.println("O  tipo da conta e "+this.getTipo());
        System.out.println();
    }
    
    public Contabanco(){
        this.saldo=0;
        this.setStatus(false);
    }
    
    public void abrir(String t,boolean st){
        this.setTipo(t);
        this.setStatus(true);
        System.out.println("Conta abierta con suceso! ");
        
        if( t =="CC"){
        this.saldo=50.0f;
        }
        else{
            this.saldo=150.0f;
        }
        
    }
    public void fechar(){
        if(this.getSaldo()> 0){
            System.out.println("Não e posivel fechar a conta por seu saldo e "+this.saldo);
        }else if ( this.getSaldo() <  0){
            System.out.println("Seu saldo esta em "+this.saldo);
        } else{
          System.out.println("A conta esta fechada con suceso");  
          this.setStatus(false);
        }
        
    }
    
    public void depositar(float v){
        if(getStatus() == true) {
         setSaldo(getSaldo()+v); 
         }  
        else{
            System.out.println("Error de deposito");
        }
        
    }
    public void sacar(float v){
        if((getStatus()==true)|| (getSaldo()>v)){
            this.setSaldo(this.getSaldo()-v);
            System.out.print("Saque valor "+v+" realizado con suceso por  "+this.getDono());
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println(" e imposivel de sacar");
        }
    }
    public void pagarMesul(){
        
        if(tipo == "CC"){
            this.vm =12.0f;
        }else if (getTipo() == "CP"){
            this.vm= 20.0f;  
        }
        if((status == true) && (saldo>=vm)){
        setSaldo(getSaldo()-vm);
        }if (this.getStatus()){
            this.setSaldo(getSaldo()-vm);
           System.out.println("Saldo insufisiente ");
            
        }else{
            System.out.println("Imposivrl pagar uma cota fechada");
        }
        
        
    }

    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param n the numConta to set
     */
    public void setNumConta(int n) {
        this.numConta = n;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param t the tipo to set
     */
    public void setTipo(String t) {
        this.tipo = t;
    }

    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param d the dono to set
     */
    public void setDono(String d) {
        this.dono = d;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param s the saldo to set
     */
    public void setSaldo(float s) {
        this.saldo = s;
    }

    /**
     * @return the status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * @param st the status to set
     */
    public void setStatus(boolean st) {
        this.status = st;
    }
    
    
    
}
