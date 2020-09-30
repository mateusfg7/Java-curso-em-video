/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe o número: <br><en>(valor 0 interrompe)</en> </html>"));
        s += n;
        } while(n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Somatório final "
                + "<br>--------------------------<br> Somatório vale " + s + "</html>");
    }
    
}
