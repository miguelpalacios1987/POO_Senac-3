/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

import java.util.Scanner;

/**
 *
 * @author Miguel Palacios
 */
public class Retangulo {
    double base,altura,area;
    
    public Retangulo(){
        
    }
    
    public void entrarBaseAltura(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Insira a base e altura");
        base=sc.nextDouble();
        altura=sc.nextDouble();
        
        sc.close();
        
    }
    
    public void areaRetangulo(){
        area=base*altura;
        System.out.println("A area do retangulo : "+area);
        
    }
    
    
    
    
    
    
    
    
}
