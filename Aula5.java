/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03.exercicioBanco1;

/**
 *
 * @author Miguel Palacios
 */
public class Aula5 {
    
    public static void main(String[] args) {
        
        Contabanco c1 = new Contabanco();
        
        c1.setNumConta(59897456);
        c1.setDono("Miguel Palacios");
        c1.abrir("CC", true);
        c1.estadoActual();
        
        Contabanco c2 = new Contabanco();
        
        c2.setNumConta(269877);
        c2.setDono("Juanita Palacios");
        c2.abrir("CP", true);
        c2.estadoActual();
        
        c1.depositar( 100.0f);
        c2.depositar(500.0f);
        c2.estadoActual();
        c1.estadoActual();
        
        c2.sacar(150f);
        c2.estadoActual();
        
    }
}
