
package com.mycompany.aula02;


public class Aula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor ="blue";
        c1.carga=30;
        c1.ponta= (float) 0.5;
        c1.tampar();
        c1.estatus();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo= "A25";
        c2.cor ="Red";
        c2.destampar();
        c2.estatus();
        c2.rabiscar();
    }
}
