/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("informe seu número: ");
        int tec = scan.nextInt();
        if (tec <= 5 && tec > 0){
            for (int i=0; i<=tec; i++){
                for (int j=0; j<=tec; j++){
                    for (int f=0; f<=tec; f++){
                        System.out.println(i+""+j+""+f);
                    
                    }
                }
            }
        } else{
            System.out.println("seu número esta fora dos limites permitidos! (maior a 0 e menor ou igual a 5)");
        }
    }
    
}
