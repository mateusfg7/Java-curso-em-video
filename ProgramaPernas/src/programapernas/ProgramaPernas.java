package programapernas;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
            break;
            case 2:
                tipo = "Bípedi";
            break;
            case 3:
                tipo = "Tripé";
            break;
            case 4:
                tipo = "Quadrúpede";
            break;
            case 6:
                tipo = "aranha";
            break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
        
        
    }
    
}
