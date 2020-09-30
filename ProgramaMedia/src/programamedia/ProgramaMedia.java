/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); //objeto para escanear o teclado
        
        //pegar notas
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        //fimPegar notas
        
        float m = (n1 + n2)/2; //calcula a média
        
        //exibe na tela
        System.out.println("Sua média foi " + m);
        if (m >= 6){
            System.out.println("PARABENS!");
        }
    }
    
}
