/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02Poo;

/**
 *
 * @author Miguel Palacios
 */
public class Aula02 {
    
    public static void main(String[] args) {
        
        Equacao2Grau  ox =new Equacao2Grau ();
        
        ox.calcularDelta(1, -3, -4);
        
        ox.calcularRaiz();
        
        Producto p1 =new Producto();
        p1.inicialValor("Kripi", 50, 5);
        p1.escreverValores();
        
        
        
        
    }
    
}
