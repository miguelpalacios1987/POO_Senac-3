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
public class Pessoa {
    
    String nome;
    int idade,idadeD;
    
    
    public Pessoa(){
        
    }
    
    public void entrarNomeIdade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome e altura ");
        nome=sc.next();
        idade=sc.nextInt();
        sc.close();
        
    }
    public void calcularIdadeEnDias(){
        
        idadeD=idade*360;
        System.out.println("A idade de "+nome+" em dias e : "+idadeD+ " Dias");
        
    }
    
    
   
    
}
