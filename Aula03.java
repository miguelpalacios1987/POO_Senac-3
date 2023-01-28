
package com.mycompany.aula03;


public class Aula03 {

    public static void main(String[] args) {
        
        Caneta1 c1 = new Caneta1();
        c1.modelo="big crist";//public
        c1.cor="Millonarios";//public
        c1.carga=80;// protected
       // c1.tampada= true; private
       c1.destampar();//o atributo dentro do etodo da 
                 //clase pode mecher com o atributo private
       
        c1.estatus();
        
    }
}
