/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emcapsulamento;

/**
 *
 * @author Miguel Palacios
 */
public class ControleRemoto implements Controlador {
    private int volumen;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
     this.volumen=50;   
     this.ligado=false;
     this.tocando=false;
 
        
    }

    /**
     * @return the volumen
     */
    private int getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    private void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    /**
     * @return the ligado
     */
    private boolean getLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
        this.tocando=true;
    }

    /**
     * @return the tocando
     */
    private boolean getTocando() {
        return tocando;
    }

    /**
     * @param tocando the tocando to set
     */
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado "+this.getLigado());
        System.out.println("O volumen e "+this.getVolumen());
        System.out.println("Esta tocando "+this.getTocando());
        for(int i =0;i<=this.getVolumen();i+=10){
            System.out.println("O volumen aumento "+i);
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println(" Fechado menu  ");
    }

    @Override
    public void maisVolumen() {
        
        if(this.getLigado()){
         this.setVolumen(getVolumen()+5);
        }
    }

    @Override
    public void menosVolumen() {
        if(this.getLigado()){
         this.setVolumen(getVolumen()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolumen() > 0){
            this.setVolumen(0);
        }
    }

    @Override
    public void deslogarMudo() {
        if(this.getLigado() && this.getVolumen() == 0);
         this.setVolumen(50);
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando()==false)){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado()&&(this.getTocando()==true)){
            this.setTocando(false);
        }
    }
}
